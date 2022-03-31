package ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

	Object[] data = null; // 객체를 담기 위한 객체배열 선언
	int capacity = 0; // 용량
	int size = 0; // 크기

	public MyVector(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다 : " + capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}

	public MyVector() {
		this(10); // 크기를 지정하지 않으면 10으로 한다
	}

	// 최소한의 저장공간을 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}

	public boolean add(Object obj) {
		ensureCapacity(size + 1); // 새로운 객체를 저장하기 전에 저장할 공간 확보
		data[size++] = obj;
		return true;
	}

	public Object get(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다");
		return data[index];
	}

	public Object remove(int index) {
		Object oldObj = null;

		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다");
		oldObj = data[index];

		// 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야한다
		if (index != size - 1) {
			// 삭제한 객체 다음~마지막 객체까지
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}

		data[size - 1] = null; // 앞으로 한칸씩 이동하고 마지막 객체는 중복되므로 지움
		size--;
		return oldObj;
	}

	public boolean remove(Object obj) {
		for (int i = 0; i < size; i++) {
			if (obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public void trimToSize() {
		setCapacity(size);
	}

	private void setCapacity(int capacity) {
		if (this.capacity == capacity) // 크기가 같으면 변경하지 않는다
			return;

		Object[] tmp = new Object[capacity]; // capacity크기의 새로운 배열 생성
		System.arraycopy(data, 0, tmp, 0, size); // 복사
		data = tmp;
		this.capacity = capacity;
	}

	public void clear() { // 모든객체 삭제
		for (int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size); // 객체배열로 반환
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return size;
	}

	/*******************************/
	/* List 인터페이스로부터 상속받은 메서드 */
	/*******************************/

	@Override
	public boolean contains(Object o) { // 지정된 객체 o가 포함되어 있는지 확인
		for (int i = 0; i < size; i++) {
			if (data[i].equals(o))
				return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object o) { // 동일한 collection인지 확인

		return false;
	}

	@Override
	public Object set(int index, Object element) { // 주어진 객체를 지정된 위치에 저장
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다");
		data[index] = element;
		return data[index];
	}

	@Override
	public void add(int index, Object element) { // 지정된 위치에 객체를 저장
		ensureCapacity(size + 1);
		data[index] = element;
	}

	@Override
	public int indexOf(Object o) { // 객체의 위치를 반환
		for (int i = 0; i < size; i++) {
			if (data[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) { // 객체의 위치를 역방향으로 찾아서 반환
		for (int i = size - 1; i >= 0; i--) {
			if (data[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		String tmp = "";
		for (int i = 0; i < size; i++) {
			tmp += data[i] + ",";
		}
		return tmp;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}

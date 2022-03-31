package ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

	Object[] data = null; // ��ü�� ��� ���� ��ü�迭 ����
	int capacity = 0; // �뷮
	int size = 0; // ũ��

	public MyVector(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ� : " + capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}

	public MyVector() {
		this(10); // ũ�⸦ �������� ������ 10���� �Ѵ�
	}

	// �ּ����� ��������� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}

	public boolean add(Object obj) {
		ensureCapacity(size + 1); // ���ο� ��ü�� �����ϱ� ���� ������ ���� Ȯ��
		data[size++] = obj;
		return true;
	}

	public Object get(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("������ ������ϴ�");
		return data[index];
	}

	public Object remove(int index) {
		Object oldObj = null;

		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�");
		oldObj = data[index];

		// �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶��, �迭���縦 ���� ���ڸ��� ä������Ѵ�
		if (index != size - 1) {
			// ������ ��ü ����~������ ��ü����
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}

		data[size - 1] = null; // ������ ��ĭ�� �̵��ϰ� ������ ��ü�� �ߺ��ǹǷ� ����
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
		if (this.capacity == capacity) // ũ�Ⱑ ������ �������� �ʴ´�
			return;

		Object[] tmp = new Object[capacity]; // capacityũ���� ���ο� �迭 ����
		System.arraycopy(data, 0, tmp, 0, size); // ����
		data = tmp;
		this.capacity = capacity;
	}

	public void clear() { // ��簴ü ����
		for (int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size); // ��ü�迭�� ��ȯ
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
	/* List �������̽��κ��� ��ӹ��� �޼��� */
	/*******************************/

	@Override
	public boolean contains(Object o) { // ������ ��ü o�� ���ԵǾ� �ִ��� Ȯ��
		for (int i = 0; i < size; i++) {
			if (data[i].equals(o))
				return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object o) { // ������ collection���� Ȯ��

		return false;
	}

	@Override
	public Object set(int index, Object element) { // �־��� ��ü�� ������ ��ġ�� ����
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�");
		data[index] = element;
		return data[index];
	}

	@Override
	public void add(int index, Object element) { // ������ ��ġ�� ��ü�� ����
		ensureCapacity(size + 1);
		data[index] = element;
	}

	@Override
	public int indexOf(Object o) { // ��ü�� ��ġ�� ��ȯ
		for (int i = 0; i < size; i++) {
			if (data[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) { // ��ü�� ��ġ�� ���������� ã�Ƽ� ��ȯ
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

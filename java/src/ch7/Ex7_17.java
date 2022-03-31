package ch7;

//공통부분을 뽑아서 Unit클래스 생성
abstract class Unit17 {
	int x, y;

	// 클래스마다 이동하는 방법이 다르므로 추상메서드
	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */
	}
}

class Marine17 extends Unit17 {
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
	}

	void stimPack() {
		/* 스팀팩을 사용한다 */
	}
}

class Tank17 extends Unit17 {
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
	}

	void changeMode() {
		/* 공격모드를 변환한다 */
	}
}

class Dropship17 extends Unit17 {
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
	}

	void load() {
		/* 선택된 대상을 태운다 */
	}

	void unload() {
		/* 선택된 대상을 내린다 */
	}
}

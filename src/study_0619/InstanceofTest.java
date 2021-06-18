package study_0619;

// instanceof 연산의 결과가 true라면, 
// 검사한 타입으로의 형변환을 해도 아무런 문제가 없다는 의미이다.

public class InstanceofTest {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) {
			System.out.println("This is a Car instance");
		}

		if (fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
	}

}

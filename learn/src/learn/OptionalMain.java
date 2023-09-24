package learn;

import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		// nullを渡すと例外発生
		Optional<String> oStr = Optional.of("oprionalString");

		Optional<Object> oEmpty = Optional.empty();
		
		// 引数がnullならば空の、nullでないなら引数を値に持つOptionalインスタンスを返す
		Optional<Object> oNull = Optional.ofNullable(null);
		Optional<Object> oNonNull = Optional.ofNullable(123);
	}
}
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
		
		System.out.println(oStr.get());
		System.out.println(oEmpty.orElse("empty"));
		System.out.println(oNull.orElseGet(() -> "elseGet"));	

		// 値の存在確認
		System.out.println(oNonNull.isPresent());
		System.out.println(oNull.isEmpty());
		oStr.ifPresent(s -> System.out.println(s));
		try {
			oNull.orElseThrow(() -> new Exception());
		} catch (Exception e) {
			System.out.println("値が存在しないため例外発生");
		}
	}
}
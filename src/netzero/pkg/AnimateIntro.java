////
///////
package netzero.pkg;

public class AnimateIntro {

	public AnimateIntro() throws InterruptedException {
		System.out.println(		
"   .         .                         .:::::::...                              \n" +
"  ?&5:      .B7            .@          !YYYYYJJP&P.                             \n" +
"  J&YB?     .@?    .::     ?@                .J#Y.    .::.    .   _    .::.     \n" +
"  J& :PB~   .&? .?5J?J5Y: JG@YY7            7#P^    ~YY??Y5!  BY5YY~ ~55JJYP?.  \n" +
"  J&.  !B5: .&? G&J   ?&B  ?@.            ^GB!     7@P    P@! @B^   7@?    :BG. \n" +
"  J&.   .J#?:&? @5^^~~^^^  ?@.          .Y#?       P@~^~~~^^: @?    P@      ?@^ \n" +
"  Y&.     :PB@? J#......:  ?@~..      .?&B~:::::::.^BP....    @?    ^BP~..:?#J  \n" +
"  !J        !Y?  :?JJJJ7   .?YJ!      ^5YJJJJJJJJJ!  !JJJJ?   @~      !JJJY?^   \n"
);

		Thread.sleep(800);
		System.out.println("- - - - - - - - ");

		for (int blaa = 6; blaa >= 1; blaa--) {
			System.out.println("L0ad1ng fr0m Magnet1c Tape: ");
			System.out.print(blaa + "   |    ");
			Thread.sleep(452);
		}
		System.out.println();
		for (int bloo = 2; bloo < 10; bloo++) {
			try {
				Thread.sleep(94);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int bluu = 2; bluu < 7; bluu++) {
				Thread.sleep(49);
				System.out.print(" #*# ");
			}
			Thread.sleep(198);
			System.out.println("Loading NET ZERO");
			try {
				Thread.sleep(224);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int dloo = 0; dloo < 1; dloo++) {
			try {
				Thread.sleep(52);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int cray = 0; cray < 1; cray++) {
				try {
					Thread.sleep(35);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.print(" #*# ");
				System.out.println(" ");
			}
			try {
				Thread.sleep(48);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(		
"   .         .                         .:::::::...                              \n" +
"  ?&5:      .B7            .@          !YYYYYJJP&P.                             \n" +
"  J&YB?     .@?    .::     ?@                .J#Y.    .::.    .   _    .::.     \n" +
"  J& :PB~   .&? .?5J?J5Y: JG@YY7            7#P^    ~YY??Y5!  BY5YY~ ~55JJYP?.  \n" +
"  J&.  !B5: .&? G&J   ?&B  ?@.            ^GB!     7@P    P@! @B^   7@?    :BG. \n" +
"  J&.   .J#?:&? @5^^~~^^^  ?@.          .Y#?       P@~^~~~^^: @?    P@      ?@^ \n" +
"  Y&.     :PB@? J#......:  ?@~..      .?&B~:::::::.^BP....    @?    ^BP~..:?#J  \n" +
"  !J        !Y?  :?JJJJ7   .?YJ!      ^5YJJJJJJJJJ!  !JJJJ?   @~      !JJJY?^   \n"
);
			System.out.println(" ** Welcome to NETZERO ** \n\n");
			Thread.sleep(27);
		}
		Thread.sleep(786);
	}
}

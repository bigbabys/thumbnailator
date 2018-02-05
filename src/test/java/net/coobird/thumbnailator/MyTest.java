package net.coobird.thumbnailator;

public class MyTest {

	
	public static void main(String[] args) {
		
//		Penguins.jpg
		try {
			Thumbnails.of("src/test/resources/Thumbnailator/20180130_wzthzq_xxh.jpg")
			.scale(1f)
			.outputQuality(0.5f)
			.outputFormat("jpg")
			.toFile("src/test/resources/Thumbnailator/20180130_wzthzq_xxh_1.jpg");
			Thumbnails.of("src/test/resources/Thumbnailator/20180131_cjspw_fhtc.png")
			.scale(1f)
			.outputQuality(0.5f)
			.outputFormat("png")
			.toFile("src/test/resources/Thumbnailator/20180131_cjspw_fhtc_1.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

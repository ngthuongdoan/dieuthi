
public class Bai2 {

	public static void main(String[] args) {
		// Biến không nguyên thủy
		float f = 1.2f;
		String s = new String("Đây là 1 chuỗi");
		// <TenKieu> [tenBien] = new <TenKieu>(....);
		/*
		 * VD như Integer là Banh Xe thì khi chấm sẽ truy xuất dc các thuộc tính và chức
		 * năng của bánh xe VD banhXe.chatLieu banhXe.lan()
		 */
		boolean thiCoYeuThuong = true;
		if (thiCoYeuThuong) {
			System.out.println("Thi yeu Thuong");
		} else {
			System.out.println("Ki dau");
		}

		for (int i = -10; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " la so chan");
			} else {
				System.out.println(i + " la so le");
			}

		}

		// Xuất kết quả
		System.out.println();
	}

}

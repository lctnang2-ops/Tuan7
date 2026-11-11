package tuan7.HangHoa;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        QuanLyHangHoa ql = new QuanLyHangHoa(10);

        HangHoa h1 = new HangHoa(
            "TP001", "SUA", "VINA",
            200, 20, LocalDate.of(2026, 10, 10)
        );

        HangHoa h2 = new HangHoa(
            "TP201", "RAU", "BAD",
            300, 20, LocalDate.of(2026, 10, 10)
        );

        // Them
        System.out.println("Them h1: " + ql.addHangHoa(h1));
        System.out.println("Them h2: " + ql.addHangHoa(h2));

        System.out.println("\n=== DANH SACH BAN DAU ===");
        ql.inDS();

        // Tim kiem
        System.out.println("\n=== TIM KIEM ===");
        HangHoa kq = ql.timTheoMa("TP001");

        if (kq != null) {
            System.out.println(kq);
        } else {
            System.out.println("Khong tim thay!");
        }

        // Sua don gia
        System.out.println("\n=== SUA DON GIA ===");
        System.out.println(ql.suaDonGia("TP001", 500));

        ql.inDS();

        // Xoa
        System.out.println("\n=== XOA HANG HOA ===");
        System.out.println(ql.xoaHHID("TP001"));

        ql.inDS();
    }
}
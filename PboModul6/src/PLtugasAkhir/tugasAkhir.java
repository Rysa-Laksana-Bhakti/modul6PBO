package PLtugasAkhir;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class tugasAkhir extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Label Nama = new Label("Nama Penerima Gaji :");
    Label lblMsk = new Label("Tahun masuk (2 digit) :");
    Label lblJamLm = new Label("Jam Lembur :");
    Label lblJbtn = new Label("Jabatan :");
    Label lblBulan = new Label("Bulan saat ini :");
    Label lblgjPk = new Label("Gaji Pokok :");
    Label lblBonus = new Label("Bonus :");
    Label LblTnjgan = new Label("Tunjangan :");
    Label lblTotGj = new Label("Total Gaji :");

    TextField Namaa = new TextField();
    TextField txtMsk = new TextField();
    TextField txtJamLm = new TextField();
    TextField txtgjPk = new TextField();
    TextField txtBulan = new TextField();
    TextField txtBonus = new TextField();
    TextField txtTnjgan = new TextField();
    TextField txtTotGj = new TextField();

    Button btnHitung = new Button("_Hitung");
    Button Hapus = new Button ("Hapus");

    RadioButton rdStaff = new RadioButton("Staff");
    RadioButton rdMng = new RadioButton("Manager");
    RadioButton rdSDir = new RadioButton("Direktur");

    void hapus(){
        Namaa.setText("");
        txtMsk.setText("");
        txtJamLm.setText("");
        txtgjPk.setText("");
        txtBulan.setText("");
        txtBonus.setText("");
        txtTnjgan.setText("");
        txtTotGj.setText("");
    }

    void hitung() {
        try {
            int jamLem, gpStaff, gpMng, gpDir, ttGjStaff, ttGjMng, ttGjDir, tjStaff, tjDir, tjMng;
            gpStaff = 7000000;
            gpMng = 10000000;
            gpDir = 17500000;
            jamLem = Integer.parseInt(txtJamLm.getText()) * 100000;
            tjStaff = (int) (gpStaff * 0.10);
            tjMng = (int) (gpMng * 0.15);
            tjDir = (int) (gpStaff * 0.20);
            ttGjStaff = gpStaff + jamLem + tjStaff;
            ttGjMng = gpMng + jamLem + tjMng;
            ttGjDir = gpDir + jamLem + tjDir;

            if (rdStaff.isSelected()) {
                txtgjPk.setText(String.valueOf(gpStaff));
                txtBonus.setText(String.valueOf(jamLem));
                txtTnjgan.setText(String.valueOf(tjStaff));
                txtTotGj.setText(String.valueOf(ttGjStaff));
            }
            if (rdMng.isSelected()) {
                txtgjPk.setText(String.valueOf(gpMng));
                txtBonus.setText(String.valueOf(jamLem));
                txtTnjgan.setText(String.valueOf(tjMng));
                txtTotGj.setText(String.valueOf(ttGjMng));
            }
            if (rdSDir.isSelected()) {
                txtgjPk.setText(String.valueOf(gpDir));
                txtBonus.setText(String.valueOf(jamLem));
                txtTnjgan.setText(String.valueOf(tjDir));
                txtTotGj.setText(String.valueOf(ttGjDir));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\n\t========== بِسْمِ اللّهِ الرَّحْمَنِ الرَّحِيْ ===========");
            System.out.println(" +----------------------------------------------------------------+");
            System.out.println("|                     Tugas                                   |");
            System.out.println("| 1. Membuat format Perhitungan gaji =====DENGAN FORMAT=====      |");
            System.out.println("|   a.Tahun awal kerja,       b.Bulan saat ini,                   |");
            System.out.println("|   c.Jumlah jam Lembur,      d.jabatan                           |");
            System.out.println("|                                                                 |");
            System.out.println("| 2. Ketentuan  =====DENGAN FORMAT=====                           |");
            System.out.println("|     a.Staff gaji pokok 7.000.000                                |");
            System.out.println("|     b.Manager gaji pokok 10.000.000                             |");
            System.out.println("|     c.Direktur gaji pokok 17.500.000                            |");
            System.out.println("|     d.Total Gaji = Gaji Pokok + Tunjangan + bonus + lembur      |");
            System.out.println("|     e.Tunjangan staff 10% gaji pokok,                           |");
            System.out.println("|       manager 15% gaji pokok, direktur 20% gaji pokok           |");
            System.out.println("|     f.Bonus = jumlah jam lembur * 100.000                       |");
            System.out.println("|     g.Hasil keluar saat anda menekan tombol hitung / enter      |");
            System.out.println("+-----------------------------------------------------------------+");
        }
    }

    GridPane gp = new GridPane();

    void gui() {
        ToggleGroup size = new ToggleGroup();
        rdStaff.setToggleGroup(size);
        rdMng.setToggleGroup(size);
        rdSDir.setToggleGroup(size);
        Namaa.setMinWidth(100);
        txtMsk.setMinWidth(100);
        txtJamLm.setMinWidth(100);
        txtgjPk.setMinWidth(100);
        txtgjPk.setEditable(false);
        txtBonus.setMinWidth(100);
        txtBonus.setEditable(false);
        txtTnjgan.setMinWidth(100);
        txtTnjgan.setEditable(false);
        txtTotGj.setMinWidth(100);
        txtTotGj.setEditable(false);

        HBox hb = new HBox();
        hb.getChildren().addAll(rdStaff, rdMng, rdSDir);

        gp.setVgap(5);
        gp.setHgap(10);
        gp.add(Nama,0,0); gp.add(Namaa,1,0);
        gp.add(lblMsk, 0, 1); gp.add(txtMsk, 1, 1);
        gp.add(lblJamLm, 0, 2); gp.add(txtJamLm, 1, 2);
        gp.add(lblBulan, 0, 3); gp.add(txtBulan, 1, 3);
        gp.add(lblJbtn, 0, 4); gp.add(hb, 1, 4);
        gp.add(lblgjPk, 0, 5); gp.add(txtgjPk, 1, 5);
        gp.add(lblBonus, 0, 6); gp.add(txtBonus, 1, 6);
        gp.add(LblTnjgan, 0, 7); gp.add(txtTnjgan, 1, 7);
        gp.add(lblTotGj, 0, 8); gp.add(txtTotGj, 1, 8);
        gp.add(btnHitung, 0, 9,2,1);
        gp.add(Hapus, 1, 9,2,1);
    }


    @Override
    public void start(Stage primaryStage) {
        gui();
        Scene sc = new Scene(gp, 340, 300);
        gp.setPadding(new Insets(10));
        primaryStage.setScene(sc);
        primaryStage.setTitle("Perhitungan Gaji");
        primaryStage.show();
        btnHitung.setOnAction(e -> hitung());
        Hapus.setOnAction(e->hapus());

    }
}


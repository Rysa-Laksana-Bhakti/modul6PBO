package tanpaFxml;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import  javafx.scene.effect.ColorInput;

public class noScanebuilder extends Application {
    static GridPane gridPane;
    private Label nim,nama,fakultas,jurusan,alamat,kota,hobi;
    private TextField inputnim,inputnama,inputfakultas,inputjurusan,inputalamat,inputkota,inputhobi;
    private Scene scene1,scene2;
    private static ListView listView = new ListView();

    public noScanebuilder() {
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BIODATA MAHASISWA");
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.TOP_LEFT);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));


        Text namaJudul = new Text("Selamat Datang Mahasiswa Baru");
        namaJudul.setFont(Font.font("Times new roman", FontWeight.NORMAL, 20));
        gridPane.add(namaJudul, 0, 0, 2, 1);

        setting(nim,"Nim\t",0,1);
        TextField a = setting2(inputnim,1,1);

        setting(nama,"Nama",0,2);
        TextField b = setting2(inputnama,1,2);

        setting(fakultas,"Fakultas",0,3);
        TextField c = setting2(inputfakultas,1,3);

        setting(jurusan,"Jurusan",0,4);
        TextField d = setting2(inputfakultas,1,4);

        setting(alamat,"Alamat",0,5);
        TextField e = setting2(inputfakultas,1,5);

        setting(kota,"Kota",0,6);
        TextField f = setting2(inputfakultas,1,6);

        setting(hobi,"Hobi\t",0,7);
        TextField g = setting2(inputfakultas,1,7);

        //tombol sign in
        Button btn = new Button("Daftar");
        HBox hbox = new HBox(8);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.getChildren().add(btn);
        gridPane.add(hbox,1,9);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                scene2 = sceneee(a,b,c,d,e,f,g);
                primaryStage.setScene(scene2);
            }
        });
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setWidth(400);
        primaryStage.setScene(scene);
        primaryStage.show();

        /* ColorInput colorInput = new ColorInput();
        colorInput.setHeight(400);
        colorInput.setWidth(400);
        colorInput.setPaint(Color.AQUAMARINE);
        gridPane.setEffect(colorInput);*/


    }
    public static Label setting(Label b, String a,int c,int d)
    {
        b = new Label(a+"\t:");
        gridPane.add(b, c, d);
        return b;
    }public static TextField setting2(TextField e,int f,int g)
    {
        e=new TextField();
        gridPane.add(e,f,g);
        return e;
    }public static Scene sceneee(TextField a,TextField b,TextField c, TextField d, TextField e, TextField f,TextField g)
    {
        GridPane gridPane2 = new GridPane();
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        Data(a,b,c,d,e,f,g);
        Label label2 = new Label("BIODATA MAHASISWA");
        label2.setFont(Font.font("Times new roman",FontWeight.NORMAL,14));
        gridPane2.setAlignment(Pos.TOP_CENTER);
        gridPane2.add(label2,0,0,10,4);



        Button exit = new Button("Exit");
        HBox box = new HBox(10);
        box.setAlignment(Pos.BOTTOM_RIGHT);
        box.getChildren().add(exit);
        gridPane2.add(box,9,20);
        StackPane scene22 = new StackPane();
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        scene22.getChildren().addAll(listView,gridPane2);
        Scene scene2 = new Scene(scene22,350,300);
        return scene2;
    }public static void Data(TextField a,TextField b,TextField c, TextField d, TextField e, TextField f,TextField g)
    {
        String[] data = {"\n","Nim\t\t: "+a.getText(),"Nama\t: "+b.getText(),"Fakultas\t: "+c.getText(),"Jurusan\t: "+d.getText(),"Alamat\t: "+e.getText(),"Kota\t\t: "+f.getText(),"Hobi\t\t: "+g.getText()};
        for (String nebular : data)
        {
            listView.getItems().add(nebular);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

}

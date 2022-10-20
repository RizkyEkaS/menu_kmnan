package scwarzcopv.mobile.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);


        Gambar		= new int[]{
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,
                R.drawable.icon_makanan,};

        NamaItem 	= new String[]{
                "Cumb Bucket lv 1",
                "Cumb Bucket lv 2",
                "Cumb Bucket lv 3",
                "Cumb Bucket lv 4",
                "Cumb Bucket lv 5"};

        HargaItem 	= new String[]{
                "Rp 155.000,-",
                "Rp 160.000,-",
                "Rp 175.000,-",
                "Rp 185.000,-",
                "Rp 200.000,-"};

        Deskripsi 	= new String[]{
                "Cumb Bucket (Lvl. 1), adalah makanan berupa bubur yang terbuat dari bahan sisa seperti kepala, tulang dan darah ikan langka yang berasal dari Bikini Buttom.",

                "Cumb Bucket (Lvl. 2), adalah makanan berupa bubur yang terbuat dari bahan sisa seperti kepala, tulang dan darah ikan langka yang berasal dari Bikini Buttom.",

                "KCumb Bucket (Lvl. 3), adalah makanan berupa bubur yang terbuat dari bahan sisa seperti kepala, tulang dan darah ikan langka yang berasal dari Bikini Buttom.",

                "Cumb Bucket (Lvl. 4), adalah makanan berupa bubur yang terbuat dari bahan sisa seperti kepala, tulang dan darah ikan langka yang berasal dari Bikini Buttom.",

                "Cumb Bucket (Lvl. 5), adalah makanan berupa bubur yang terbuat dari bahan sisa seperti kepala, tulang dan darah ikan langka yang berasal dari Bikini Buttom."};
				
				
		//Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+6289525005533",
                "+6289525005533",
                "+6289525005533",
                "+6289525005533",
                "+6289525005533"
        };

        Lat  = new String[]{
                "-10.1760821",
                "-10.1768035",
                "-10.171799",
                "-10.1748536",
                "-10.1747994"
        };

        Long  = new String[]{
                "123.6235399",
                "123.6229451",
                "123.6285576",
                "123.6262513",
                "123.6261514"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}

package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Sepatu;
import simple.example.hewanpedia.model.AlasKaki;
import simple.example.hewanpedia.model.Sandal;
import simple.example.hewanpedia.model.Slop;

public class DataProvider {
    private static List<AlasKaki> alasKakis = new ArrayList<>();

    private static List<Sandal> initDataSandal(Context ctx) {
        List<Sandal> sandals = new ArrayList<>();
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendalcoksu), ctx.getString(R.string.asal_sendalcoksu),
                ctx.getString(R.string.descripsi_sendalcoksu), R.drawable.sandalcoksu));
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendaldaun), ctx.getString(R.string.asal_sendaldaun),
                ctx.getString(R.string.descripsi_sendaldaun), R.drawable.sandaldaun));
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendalldg), ctx.getString(R.string.asal_sendalldg),
                ctx.getString(R.string.descripsi_sendalldg), R.drawable.sandalldg));
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendalpink), ctx.getString(R.string.asal_sendalpink),
                ctx.getString(R.string.descripsi_sendalpink), R.drawable.sandalpink));
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendalhak), ctx.getString(R.string.asal_sendalhak),
                ctx.getString(R.string.descripsi_sendalhak), R.drawable.sandalhak));
        sandals.add(new Sandal(ctx.getString(R.string.nama_sendallucu), ctx.getString(R.string.asal_sendallucu),
                ctx.getString(R.string.descripsi_sendallucu), R.drawable.sandallucu));
        return sandals;
    }

    private static List<Sepatu> initDataSepatu(Context ctx) {
        List<Sepatu> sepatus = new ArrayList<>();
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatu1), ctx.getString(R.string.asal_sepatu1),
                ctx.getString(R.string.descripsi_sepatu1), R.drawable.sepatu1));
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatu2), ctx.getString(R.string.asal_sepatu2),
                ctx.getString(R.string.descripsi_sepatu2), R.drawable.sepatu2));
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatucowok), ctx.getString(R.string.asal_sepatucowok),
                ctx.getString(R.string.descripsi_sepatucowok), R.drawable.sepatucowok));
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatupink), ctx.getString(R.string.asal_sepatupink),
                ctx.getString(R.string.descripsi_sepatupink), R.drawable.sepatupink));
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatu3), ctx.getString(R.string.asal_sepatu3),
                ctx.getString(R.string.descripsi_sepatu3), R.drawable.sepatu3));
        sepatus.add(new Sepatu(ctx.getString(R.string.nama_sepatuputih), ctx.getString(R.string.asal_sepatuputih),
                ctx.getString(R.string.descripsi_sepatuputih), R.drawable.sepatuputih));
        return sepatus;
    }

    private static List<Slop> initDataSlop(Context ctx) {
        List<Slop> slops = new ArrayList<>();
        slops.add(new Slop(ctx.getString(R.string.nama_slopbiru), ctx.getString(R.string.asal_slopbiru),
                ctx.getString(R.string.descripsi_slopbiru), R.drawable.slopbiru));
        slops.add(new Slop(ctx.getString(R.string.nama_slopcowok), ctx.getString(R.string.asal_slopcowok),
                ctx.getString(R.string.descripsi_slopcowok), R.drawable.slopcowok));
        slops.add(new Slop(ctx.getString(R.string.nama_slophitam), ctx.getString(R.string.asal_slophitam),
                ctx.getString(R.string.descripsi_slophitam), R.drawable.slophitam));
        slops.add(new Slop(ctx.getString(R.string.nama_slophitamtinggi), ctx.getString(R.string.asal_slophitamtinggi),
                ctx.getString(R.string.descripsi_slophitamtinggi), R.drawable.slophitamtinggi));
        slops.add(new Slop(ctx.getString(R.string.nama_slopp), ctx.getString(R.string.asal_slopp),
                ctx.getString(R.string.descripsi_slopp), R.drawable.slopp));
        slops.add(new Slop(ctx.getString(R.string.nama_slopcantik), ctx.getString(R.string.asal_slopcantik),
                ctx.getString(R.string.descripsi_slopcantik), R.drawable.slopcantikk));
        return slops;
    }

    private static void initAllAlasKakis(Context ctx) {
        alasKakis.addAll(initDataSandal(ctx));
        alasKakis.addAll(initDataSepatu(ctx));
        alasKakis.addAll(initDataSlop(ctx));
    }

    public static List<AlasKaki> getAllHewan(Context ctx) {
        if (alasKakis.size() == 0) {
            initAllAlasKakis(ctx);
        }
        return alasKakis;
    }

    public static List<AlasKaki> getAlasKakisByTipe(Context ctx, String jenis) {
        List<AlasKaki> hewansByType = new ArrayList<>();
        if (alasKakis.size() == 0) {
            initAllAlasKakis(ctx);
        }
        for (AlasKaki h : alasKakis) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}

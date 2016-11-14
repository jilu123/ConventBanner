package bawei.com.conventbanner;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> networkImages;
    private ArrayList<String> transformerList = new ArrayList<String>();
    String img[]={"http://img2.imgtn.bdimg.com/it/u=3093785514,1341050958&fm=21&gp=0.jpg",
            "http://img2.3lian.com/2014/f2/37/d/40.jpg",
            "http://d.3987.com/sqmy_131219/001.jpg",
            "http://img2.3lian.com/2014/f2/37/d/39.jpg",
            "http://www.8kmm.com/UploadFiles/2012/8/201208140920132659.jpg",
            "http://f.hiphotos.baidu.com/image/h%3D200/sign=1478eb74d5a20cf45990f9df460b4b0c/d058ccbf6c81800a5422e5fdb43533fa838b4779.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/09fa513d269759ee50f1971ab6fb43166c22dfba.jpg"};
    ConvenientBanner convenientBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置图片缓存策略

        convenientBanner= (ConvenientBanner) findViewById(R.id.contentbanner);

        networkImages= Arrays.asList(img);
        convenientBanner.setPages(new CBViewHolderCreator<NetImageview>() {
            @Override
            public NetImageview createHolder() {
                return new NetImageview();
            }
        },networkImages).setPageIndicator(new int[]{R.drawable.a3, R.drawable.a4})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL)
                .setPageTransformer(new ViewPager.PageTransformer() {
                    @Override
                    public void transformPage(View page, float position) {

                        
                    }
                })
        .setCanLoop(false);
        convenientBanner.startTurning(1000);


    }




}

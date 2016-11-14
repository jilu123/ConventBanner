package bawei.com.conventbanner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.lidroid.xutils.BitmapUtils;


/**
 * Created by Administrator on 2016/11/1.
 */
public class NetImageview implements Holder<String> {

    ImageView imageView;


    @Override
    public View createView(Context context) {
        imageView=new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, String data) {

        BitmapUtils bitmapUtils=new BitmapUtils(context);
        bitmapUtils.display(imageView,data);

    }
}

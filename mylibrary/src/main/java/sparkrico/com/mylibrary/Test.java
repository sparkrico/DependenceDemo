package sparkrico.com.mylibrary;

import android.util.Log;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by xiecheng on 2018/11/20
 */
public class Test {
    public void x() {
        Log.d("zzz", "x from aar");
        Flowable.just("Hello world")
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                });
    }
}

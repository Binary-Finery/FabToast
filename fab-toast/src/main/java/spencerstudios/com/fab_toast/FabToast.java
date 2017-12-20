package spencerstudios.com.fab_toast;


import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FabToast extends Toast {

    public static final int SUCCESS = 1;
    public static final int INFORMATION = 2;
    public static final int ERROR = 3;
    public static final int WARNING = 4;

    public static final int POSITION_DEFAULT = 1;
    public static final int POSITION_CENTER = 2;
    public static final int POSITION_TOP = 3;

    public FabToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context,String toastMessage,int duration, int type, int pos){
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.fab_toast_layout, null, false);
        LinearLayout toastRoot = layout.findViewById(R.id.toast_root);
        LinearLayout imageWrapper = layout.findViewById(R.id.image_view_wrapper);
        ImageView image = layout.findViewById(R.id.image);

        TextView text = layout.findViewById(R.id.toast_text);

        switch (pos){
            case 2:
                toast.setGravity(Gravity.CENTER, 0, 0);
                break;
            case 3:
                toast.setGravity(Gravity.TOP, 0,0);
                break;
        }

        switch (type){
            case 1:
                toastRoot.setBackgroundResource(R.drawable.success_toast);
                imageWrapper.setBackgroundResource(R.drawable.success_round);
                image.setImageResource(R.drawable.ic_done_white_24dp);
                break;
            case 2:
                toastRoot.setBackgroundResource(R.drawable.info_toast);
                imageWrapper.setBackgroundResource(R.drawable.info_round);
                image.setImageResource(R.drawable.ic_info_outline_white_24dp);
                break;
            case 3:
                toastRoot.setBackgroundResource(R.drawable.error_toast);
                imageWrapper.setBackgroundResource(R.drawable.error_round);
                image.setImageResource(R.drawable.ic_close_white_24dp);
                break;
            case 4:
                toastRoot.setBackgroundResource(R.drawable.warning_toast);
                imageWrapper.setBackgroundResource(R.drawable.warning_round);
                image.setImageResource(R.drawable.ic_pan_tool_white_24dp);
                break;
        }

        text.setText(toastMessage);
        toast.setView(layout);
        return toast;
    }
}

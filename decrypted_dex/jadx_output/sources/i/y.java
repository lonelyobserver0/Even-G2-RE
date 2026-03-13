package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import n.C1298C;
import n.C1300D;
import n.C1304F;
import n.C1316Q;
import n.C1334e0;
import n.C1353o;
import n.C1357q;
import n.C1359r;
import n.C1361s;
import n.C1369w;
import n.C1373y;
import n.C1375z;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class y {
    private final Object[] mConstructorArgs = new Object[2];
    private static final String LOG_TAG = StubApp.getString2(18431);
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {StubApp.getString2(18429), StubApp.getString2(18430), StubApp.getString2(18428)};
    private static final C1697j sConstructorMap = new C1697j(0);

    public final View a(Context context, String str, String str2) {
        String concat;
        C1697j c1697j = sConstructorMap;
        Constructor constructor = (Constructor) c1697j.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c1697j.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + StubApp.getString2(18432) + str + StubApp.getString2(18433));
    }

    public C1353o createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1353o(context, attributeSet);
    }

    public C1357q createButton(Context context, AttributeSet attributeSet) {
        return new C1357q(context, attributeSet);
    }

    public C1359r createCheckBox(Context context, AttributeSet attributeSet) {
        return new C1359r(context, attributeSet, 2130903186);
    }

    public C1361s createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C1361s(context, attributeSet);
    }

    public C1369w createEditText(Context context, AttributeSet attributeSet) {
        return new C1369w(context, attributeSet);
    }

    public C1373y createImageButton(Context context, AttributeSet attributeSet) {
        return new C1373y(context, attributeSet, 2130903434);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C1375z createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1375z(context, attributeSet);
    }

    public C1298C createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1298C(context, attributeSet);
    }

    public C1300D createRatingBar(Context context, AttributeSet attributeSet) {
        return new C1300D(context, attributeSet);
    }

    public C1304F createSeekBar(Context context, AttributeSet attributeSet) {
        return new C1304F(context, attributeSet);
    }

    public C1316Q createSpinner(Context context, AttributeSet attributeSet) {
        return new C1316Q(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public C1334e0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C1334e0(context, attributeSet);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x022c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final android.view.View createView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.y.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}

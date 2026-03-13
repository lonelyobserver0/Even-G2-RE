package gb;

import java.util.List;

/* renamed from: gb.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface InterfaceC0992v {
    boolean clipboardHasStrings();

    CharSequence getClipboardData(EnumC0990t enumC0990t);

    void playSystemSound(EnumC0993w enumC0993w);

    void popSystemNavigator();

    void restoreSystemUiOverlays();

    void setApplicationSwitcherDescription(C0989s c0989s);

    void setClipboardData(String str);

    void setFrameworkHandlesBack(boolean z2);

    void setPreferredOrientations(int i3);

    void setSystemUiChangeListener();

    void setSystemUiOverlayStyle(C0994x c0994x);

    void share(String str);

    void showSystemOverlays(List list);

    void showSystemUiMode(EnumC0995y enumC0995y);

    void vibrateHapticFeedback(EnumC0991u enumC0991u);
}

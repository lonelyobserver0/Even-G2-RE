package io.flutter.plugin.platform;

import N.d0;
import N.e0;
import N.f0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.stub.StubApp;
import d.InterfaceC0756A;
import gb.C0969A;
import gb.C0989s;
import gb.C0994x;
import gb.EnumC0990t;
import gb.EnumC0991u;
import gb.EnumC0993w;
import gb.EnumC0995y;
import gb.EnumC0996z;
import gb.InterfaceC0992v;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = StubApp.getString2(18758);
    private final Activity activity;
    private C0994x currentTheme;
    private int mEnabledOverlays;
    final InterfaceC0992v mPlatformMessageHandler;
    private final C0969A platformChannel;
    private final PlatformPluginDelegate platformPluginDelegate;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View val$decorView;

        public AnonymousClass2(View view) {
            this.val$decorView = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onSystemUiVisibilityChange$0(int i3) {
            int i10 = i3 & 4;
            String string2 = StubApp.getString2(18756);
            if (i10 == 0) {
                C0969A c0969a = PlatformPlugin.this.platformChannel;
                c0969a.getClass();
                c0969a.f14243a.invokeMethod(string2, Arrays.asList(Boolean.TRUE));
                return;
            }
            C0969A c0969a2 = PlatformPlugin.this.platformChannel;
            c0969a2.getClass();
            c0969a2.f14243a.invokeMethod(string2, Arrays.asList(Boolean.FALSE));
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i3) {
            this.val$decorView.post(new Runnable() { // from class: io.flutter.plugin.platform.b
                @Override // java.lang.Runnable
                public final void run() {
                    PlatformPlugin.AnonymousClass2.this.lambda$onSystemUiVisibilityChange$0(i3);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        static {
            int[] iArr = new int[AbstractC1856e.d(2).length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0996z.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[EnumC0991u.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();

        default void setFrameworkHandlesBack(boolean z2) {
        }
    }

    public PlatformPlugin(Activity activity, C0969A c0969a) {
        this(activity, c0969a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService(StubApp.getString2(18687));
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType(StubApp.getString2(18757));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getClipboardData(EnumC0990t enumC0990t) {
        String string2 = StubApp.getString2(18758);
        String string22 = StubApp.getString2(18759);
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService(StubApp.getString2(18687));
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (enumC0990t != null && enumC0990t != EnumC0990t.f14369a) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w(string2, StubApp.getString2("18760"));
                        return null;
                    }
                    String scheme = uri.getScheme();
                    if (!scheme.equals(StubApp.getString2("1248"))) {
                        Log.w(string2, string22 + scheme + StubApp.getString2("18761"));
                        return null;
                    }
                    AssetFileDescriptor openTypedAssetFileDescriptor = this.activity.getContentResolver().openTypedAssetFileDescriptor(uri, StubApp.getString2("18757"), null);
                    CharSequence coerceToText = itemAt.coerceToText(this.activity);
                    if (openTypedAssetFileDescriptor == null) {
                        return coerceToText;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                        return coerceToText;
                    } catch (IOException e10) {
                        charSequence = coerceToText;
                        e = e10;
                        Log.w(string2, StubApp.getString2(18762), e);
                        return charSequence;
                    }
                } catch (IOException e11) {
                    e = e11;
                    charSequence = text;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (FileNotFoundException unused) {
            Log.w(string2, StubApp.getString2(18763));
            return null;
        } catch (SecurityException e13) {
            Log.w(string2, StubApp.getString2(18764), e13);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSystemSound(EnumC0993w enumC0993w) {
        if (enumC0993w == EnumC0993w.f14373b) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
            Activity activity = this.activity;
            if (activity instanceof InterfaceC0756A) {
                ((InterfaceC0756A) activity).a().b();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService(StubApp.getString2(18687))).setPrimaryClip(ClipData.newPlainText(StubApp.getString2(18686), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkHandlesBack(boolean z2) {
        PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate != null) {
            platformPluginDelegate.setFrameworkHandlesBack(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(C0989s c0989s) {
        this.activity.setTaskDescription(new ActivityManager.TaskDescription(c0989s.f14368b, 0, c0989s.f14367a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new AnonymousClass2(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(EnumC0995y enumC0995y) {
        int i3;
        if (enumC0995y == EnumC0995y.f14383b) {
            i3 = 1798;
        } else if (enumC0995y == EnumC0995y.f14384c) {
            i3 = 3846;
        } else if (enumC0995y == EnumC0995y.f14385d) {
            i3 = 5894;
        } else if (enumC0995y != EnumC0995y.f14386e || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i3 = 1792;
        }
        this.mEnabledOverlays = i3;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(List<EnumC0996z> list) {
        int i3 = list.size() == 0 ? 5894 : 1798;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[list.get(i10).ordinal()];
            if (i11 == 1) {
                i3 &= -5;
            } else if (i11 == 2) {
                i3 &= -515;
            }
        }
        this.mEnabledOverlays = i3;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i3) {
        this.activity.setRequestedOrientation(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeSystemUIOverlayStyle(C0994x c0994x) {
        Window window = this.activity.getWindow();
        window.getDecorView();
        int i3 = Build.VERSION.SDK_INT;
        Y3.a f0Var = i3 >= 35 ? new f0(window) : i3 >= 30 ? new e0(window) : new d0(window);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i11 = c0994x.f14377b;
        if (i11 != 0) {
            int c10 = AbstractC1856e.c(i11);
            if (c10 == 0) {
                f0Var.w(false);
            } else if (c10 == 1) {
                f0Var.w(true);
            }
        }
        Integer num = c0994x.f14376a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = c0994x.f14378c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        int i12 = c0994x.f14380e;
        if (i12 != 0) {
            int c11 = AbstractC1856e.c(i12);
            if (c11 == 0) {
                f0Var.v(false);
            } else if (c11 == 1) {
                f0Var.v(true);
            }
        }
        Integer num2 = c0994x.f14379d;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        Integer num3 = c0994x.f14381f;
        if (num3 != null) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = c0994x.f14382g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = c0994x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(String str) {
        Intent intent = new Intent();
        intent.setAction(StubApp.getString2(624));
        intent.setType(StubApp.getString2(625));
        intent.putExtra(StubApp.getString2(623), str);
        this.activity.startActivity(Intent.createChooser(intent, null));
    }

    public void destroy() {
        this.platformChannel.f14244b = null;
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        C0994x c0994x = this.currentTheme;
        if (c0994x != null) {
            setSystemChromeSystemUIOverlayStyle(c0994x);
        }
    }

    public void vibrateHapticFeedback(EnumC0991u enumC0991u) {
        View decorView = this.activity.getWindow().getDecorView();
        int i3 = AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[enumC0991u.ordinal()];
        if (i3 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i3 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i3 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i3 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i3 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public PlatformPlugin(Activity activity, C0969A c0969a, PlatformPluginDelegate platformPluginDelegate) {
        InterfaceC0992v interfaceC0992v = new InterfaceC0992v() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            @Override // gb.InterfaceC0992v
            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            @Override // gb.InterfaceC0992v
            public CharSequence getClipboardData(EnumC0990t enumC0990t) {
                return PlatformPlugin.this.getClipboardData(enumC0990t);
            }

            @Override // gb.InterfaceC0992v
            public void playSystemSound(EnumC0993w enumC0993w) {
                PlatformPlugin.this.playSystemSound(enumC0993w);
            }

            @Override // gb.InterfaceC0992v
            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            @Override // gb.InterfaceC0992v
            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            @Override // gb.InterfaceC0992v
            public void setApplicationSwitcherDescription(C0989s c0989s) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(c0989s);
            }

            @Override // gb.InterfaceC0992v
            public void setClipboardData(String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            @Override // gb.InterfaceC0992v
            public void setFrameworkHandlesBack(boolean z2) {
                PlatformPlugin.this.setFrameworkHandlesBack(z2);
            }

            @Override // gb.InterfaceC0992v
            public void setPreferredOrientations(int i3) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i3);
            }

            @Override // gb.InterfaceC0992v
            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            @Override // gb.InterfaceC0992v
            public void setSystemUiOverlayStyle(C0994x c0994x) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(c0994x);
            }

            @Override // gb.InterfaceC0992v
            public void share(String str) {
                PlatformPlugin.this.share(str);
            }

            @Override // gb.InterfaceC0992v
            public void showSystemOverlays(List<EnumC0996z> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            @Override // gb.InterfaceC0992v
            public void showSystemUiMode(EnumC0995y enumC0995y) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(enumC0995y);
            }

            @Override // gb.InterfaceC0992v
            public void vibrateHapticFeedback(EnumC0991u enumC0991u) {
                PlatformPlugin.this.vibrateHapticFeedback(enumC0991u);
            }
        };
        this.mPlatformMessageHandler = interfaceC0992v;
        this.activity = activity;
        this.platformChannel = c0969a;
        c0969a.f14244b = interfaceC0992v;
        this.platformPluginDelegate = platformPluginDelegate;
        this.mEnabledOverlays = DEFAULT_SYSTEM_UI;
    }
}

package aa;

import E9.m;
import Xa.z;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.P1;
import com.stub.StubApp;
import e5.j;
import e5.k;
import fa.AbstractC0936b;
import i.C1019C;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import m.l;
import m.w;
import n.C1337g;
import n.C1345k;
import o0.C1436k;
import r0.AbstractC1550k;

/* renamed from: aa.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0398e implements k, w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9343a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9344b;

    public C0398e(Uri uri, boolean z2, boolean z10) {
        this.f9344b = uri;
        this.f9343a = z2;
    }

    public static void f(C0397d c0397d, String str, String str2) {
        if (c0397d.f9342a.equals(str)) {
            return;
        }
        StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(8567), str2, StubApp.getString2(8568));
        l9.append(c0397d.f9342a);
        throw new IOException(l9.toString());
    }

    public static int g(byte[] bArr) {
        int i3 = bArr[0] & UByte.MAX_VALUE;
        return bArr.length == 2 ? (i3 << 8) + (bArr[1] & UByte.MAX_VALUE) : i3;
    }

    public static BufferedInputStream i(String str) {
        if (AbstractC0624h2.o()) {
            return new BufferedInputStream(AbstractC0624h2.k(StubApp.getString2(8569) + str));
        }
        InputStream resourceAsStream = C0398e.class.getResourceAsStream(StubApp.getString2(8570) + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException(E1.a.j(StubApp.getString2(8571), str));
    }

    public static boolean j(int i3, byte[] bArr, boolean z2) {
        if (i3 <= 0 || (bArr[i3] & UByte.MAX_VALUE) != 255) {
            bArr[i3] = (byte) (bArr[i3] + 1);
            return true;
        }
        if (z2) {
            return false;
        }
        bArr[i3] = 0;
        j(i3 - 1, bArr, z2);
        return true;
    }

    public static boolean k(int i3) {
        return i3 == 37 || i3 == 47 || i3 == 60 || i3 == 62 || i3 == 91 || i3 == 93 || i3 == 123 || i3 == 125 || i3 == 40 || i3 == 41;
    }

    public static boolean n(int i3) {
        return i3 == -1 || i3 == 32 || i3 == 13 || i3 == 10;
    }

    @Override // e5.k
    public void a(j jVar, int i3) {
        boolean z2 = this.f9343a;
        StringBuilder sb2 = (StringBuilder) this.f9344b;
        if (z2) {
            this.f9343a = false;
        } else {
            sb2.append(StubApp.getString2(81));
        }
        sb2.append(i3);
    }

    @Override // m.w
    public void b(l lVar, boolean z2) {
        C1345k c1345k;
        if (this.f9343a) {
            return;
        }
        this.f9343a = true;
        C1019C c1019c = (C1019C) this.f9344b;
        ActionMenuView actionMenuView = c1019c.f14504b.f17488a.f9576a;
        if (actionMenuView != null && (c1345k = actionMenuView.f9482w) != null) {
            c1345k.g();
            C1337g c1337g = c1345k.f17550w;
            if (c1337g != null && c1337g.b()) {
                c1337g.f16996i.dismiss();
            }
        }
        c1019c.f14505c.onPanelClosed(108, lVar);
        this.f9343a = false;
    }

    public void c(int i3) {
        AbstractC1550k.g(!this.f9343a);
        ((SparseBooleanArray) this.f9344b).append(i3, true);
    }

    public void d(C0395b c0395b, byte[] bArr, int i3, byte[] bArr2) {
        for (int i10 = 0; i10 < i3; i10++) {
            c0395b.a(new String(bArr2, bArr2.length == 1 ? AbstractC0936b.f14188a : AbstractC0936b.f14190c), bArr);
            if (!j(bArr2.length - 1, bArr2, this.f9343a)) {
                return;
            }
            j(bArr.length - 1, bArr, false);
        }
    }

    public C1436k e() {
        AbstractC1550k.g(!this.f9343a);
        this.f9343a = true;
        return new C1436k((SparseBooleanArray) this.f9344b);
    }

    public boolean h() {
        return this.f9343a;
    }

    public boolean l(CharSequence charSequence, int i3) {
        if (charSequence == null || i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (((L.e) this.f9344b) == null) {
            return h();
        }
        char c10 = 2;
        for (int i10 = 0; i10 < i3 && c10 == 2; i10++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i10));
            C0398e c0398e = L.f.f3877a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c10 = 2;
                            break;
                    }
                }
                c10 = 0;
            }
            c10 = 1;
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return h();
        }
        return false;
    }

    @Override // m.w
    public boolean m(l lVar) {
        ((C1019C) this.f9344b).f14505c.onMenuOpened(108, lVar);
        return true;
    }

    public void o(boolean z2) {
        if (this.f9343a) {
            throw new IllegalStateException(StubApp.getString2(8572));
        }
        this.f9343a = true;
        Fb.a aVar = (Fb.a) this.f9344b;
        int i3 = aVar.f2346b - 1;
        aVar.f2346b = i3;
        boolean z10 = z2 | aVar.f2345a;
        aVar.f2345a = z10;
        if (i3 != 0 || z10) {
            return;
        }
        ((z) aVar.f2348d).a((KeyEvent) aVar.f2347c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x045c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x045c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x045c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x045f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x045c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x045c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aa.C0395b p(java.io.FilterInputStream r19) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.C0398e.p(java.io.FilterInputStream):aa.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8 A[Catch: NumberFormatException -> 0x00bd, TryCatch #0 {NumberFormatException -> 0x00bd, blocks: (B:53:0x00b2, B:55:0x00b8, B:57:0x00bf), top: B:52:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf A[Catch: NumberFormatException -> 0x00bd, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00bd, blocks: (B:53:0x00b2, B:55:0x00b8, B:57:0x00bf), top: B:52:0x00b2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.io.PushbackInputStream r11) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.C0398e.q(java.io.PushbackInputStream):java.lang.Object");
    }

    public void r() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new R5.c());
        mediaPlayer.setOnErrorListener(new m(1));
        try {
            AssetFileDescriptor openRawResourceFd = ((Context) this.f9344b).getResources().openRawResourceFd(2131689475);
            try {
                mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                openRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                openRawResourceFd.close();
                throw th;
            }
        } catch (IOException e10) {
            Log.w("e", e10);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public P1 s(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = P1.f11332g;
        return new P1(this, str, valueOf, 0);
    }

    public P1 t(String str, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Object obj = P1.f11332g;
        return new P1(this, str, valueOf, 1);
    }

    public P1 u(String str, String str2) {
        Object obj = P1.f11332g;
        return new P1(this, str, str2, 3);
    }

    public /* synthetic */ C0398e(Object obj) {
        this.f9344b = obj;
    }

    public /* synthetic */ C0398e(Object obj, boolean z2) {
        this.f9343a = z2;
        this.f9344b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0398e(int i3, boolean z2) {
        this((Object) null, false);
        switch (i3) {
            case 8:
                break;
            case 9:
            default:
                this.f9344b = new byte[512];
                this.f9343a = false;
                break;
            case 10:
                this.f9344b = new SparseBooleanArray();
                break;
        }
    }

    public C0398e(L.e eVar, boolean z2) {
        this(eVar);
        this.f9343a = z2;
    }
}

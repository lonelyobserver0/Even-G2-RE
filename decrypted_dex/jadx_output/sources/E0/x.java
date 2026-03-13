package E0;

import L0.Y;
import L0.Z;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.stub.StubApp;
import i.C1020a;
import i.C1021b;
import i.C1023d;
import i.C1024e;
import i.DialogInterfaceC1025f;
import java.util.Arrays;
import kotlin.UByte;
import r0.C1553n;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x implements w, Z {

    /* renamed from: a, reason: collision with root package name */
    public int f1861a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1862b;

    public /* synthetic */ x(int i3, Object[] objArr) {
        this.f1861a = i3;
        this.f1862b = objArr;
    }

    @Override // L0.Z
    public void a() {
        B0.v vVar = ((H0.t) this.f1862b).f2636m;
        if (vVar != null) {
            throw vVar;
        }
    }

    @Override // E0.w
    public MediaCodecInfo b(int i3) {
        if (((MediaCodecInfo[]) this.f1862b) == null) {
            this.f1862b = new MediaCodecList(this.f1861a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1862b)[i3];
    }

    public void c(long j) {
        int i3 = this.f1861a;
        long[] jArr = (long[]) this.f1862b;
        if (i3 == jArr.length) {
            this.f1862b = Arrays.copyOf(jArr, i3 * 2);
        }
        long[] jArr2 = (long[]) this.f1862b;
        int i10 = this.f1861a;
        this.f1861a = i10 + 1;
        jArr2[i10] = j;
    }

    public void d(long[] jArr) {
        int length = this.f1861a + jArr.length;
        long[] jArr2 = (long[]) this.f1862b;
        if (length > jArr2.length) {
            this.f1862b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1862b, this.f1861a, jArr.length);
        this.f1861a = length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC1025f e() {
        C1021b c1021b = (C1021b) this.f1862b;
        DialogInterfaceC1025f dialogInterfaceC1025f = new DialogInterfaceC1025f(c1021b.f14552a, this.f1861a);
        View view = c1021b.f14556e;
        C1024e c1024e = dialogInterfaceC1025f.f14601f;
        if (view != null) {
            c1024e.f14593u = view;
        } else {
            CharSequence charSequence = c1021b.f14555d;
            if (charSequence != null) {
                c1024e.f14577d = charSequence;
                TextView textView = c1024e.f14591s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1021b.f14554c;
            if (drawable != null) {
                c1024e.f14589q = drawable;
                ImageView imageView = c1024e.f14590r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1024e.f14590r.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c1021b.f14557f;
        if (charSequence2 != null) {
            c1024e.f14578e = charSequence2;
            TextView textView2 = c1024e.f14592t;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c1021b.f14558g;
        if (charSequence3 != null) {
            c1024e.b(-1, charSequence3, c1021b.f14559h);
        }
        CharSequence charSequence4 = c1021b.f14560i;
        if (charSequence4 != null) {
            c1024e.b(-2, charSequence4, c1021b.j);
        }
        CharSequence charSequence5 = c1021b.f14561k;
        if (charSequence5 != null) {
            c1024e.b(-3, charSequence5, c1021b.f14562l);
        }
        if (c1021b.f14564n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1021b.f14553b.inflate(c1024e.f14597y, (ViewGroup) null);
            int i3 = c1021b.f14566p ? c1024e.f14598z : c1024e.f14570A;
            Object obj = c1021b.f14564n;
            ?? r72 = obj;
            if (obj == null) {
                r72 = new C1023d(c1021b.f14552a, i3, R.id.text1, null);
            }
            c1024e.f14594v = r72;
            c1024e.f14595w = c1021b.f14567q;
            if (c1021b.f14565o != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1020a(c1021b, c1024e));
            }
            if (c1021b.f14566p) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1024e.f14579f = alertController$RecycleListView;
        }
        dialogInterfaceC1025f.setCancelable(true);
        dialogInterfaceC1025f.setCanceledOnTouchOutside(true);
        dialogInterfaceC1025f.setOnCancelListener(null);
        dialogInterfaceC1025f.setOnDismissListener(null);
        m.m mVar = c1021b.f14563m;
        if (mVar != null) {
            dialogInterfaceC1025f.setOnKeyListener(mVar);
        }
        return dialogInterfaceC1025f;
    }

    public long f(int i3) {
        if (i3 >= 0 && i3 < this.f1861a) {
            return ((long[]) this.f1862b)[i3];
        }
        StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(1689), StubApp.getString2(1690));
        u2.append(this.f1861a);
        throw new IndexOutOfBoundsException(u2.toString());
    }

    public long g(T0.l lVar) {
        C1553n c1553n = (C1553n) this.f1862b;
        int i3 = 0;
        lVar.i(c1553n.f20176a, 0, 1, false);
        int i10 = c1553n.f20176a[0] & UByte.MAX_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        lVar.i(c1553n.f20176a, 1, i12, false);
        while (i3 < i12) {
            i3++;
            i13 = (c1553n.f20176a[i3] & UByte.MAX_VALUE) + (i13 << 8);
        }
        this.f1861a = i12 + 1 + this.f1861a;
        return i13;
    }

    @Override // L0.Z
    public boolean h() {
        H0.t tVar = (H0.t) this.f1862b;
        if (tVar.f2641s) {
            return false;
        }
        H0.s sVar = (H0.s) tVar.f2630e.get(this.f1861a);
        return sVar.f2622c.r(sVar.f2623d);
    }

    @Override // L0.Z
    public int i(C1803F c1803f, u0.e eVar, int i3) {
        H0.t tVar = (H0.t) this.f1862b;
        if (tVar.f2641s) {
            return -3;
        }
        H0.s sVar = (H0.s) tVar.f2630e.get(this.f1861a);
        return sVar.f2622c.w(c1803f, eVar, i3, sVar.f2623d);
    }

    @Override // E0.w
    public boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // E0.w
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // L0.Z
    public int m(long j) {
        H0.t tVar = (H0.t) this.f1862b;
        if (tVar.f2641s) {
            return -3;
        }
        H0.s sVar = (H0.s) tVar.f2630e.get(this.f1861a);
        Y y10 = sVar.f2622c;
        int p8 = y10.p(j, sVar.f2623d);
        y10.B(p8);
        return p8;
    }

    @Override // E0.w
    public int n() {
        if (((MediaCodecInfo[]) this.f1862b) == null) {
            this.f1862b = new MediaCodecList(this.f1861a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1862b).length;
    }

    @Override // E0.w
    public boolean q() {
        return true;
    }

    public /* synthetic */ x(Object obj, int i3) {
        this.f1862b = obj;
        this.f1861a = i3;
    }

    public x(int i3) {
        this.f1862b = new long[i3];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(int i3, boolean z2) {
        this(32);
        switch (i3) {
            case 8:
                break;
            default:
                this.f1862b = new C1553n(8);
                break;
        }
    }

    public x(int i3, Z9.n nVar) {
        this.f1861a = i3;
        this.f1862b = new Z9.n[]{nVar};
    }

    public x(Context context) {
        int g10 = DialogInterfaceC1025f.g(context, 0);
        this.f1862b = new C1021b(new ContextThemeWrapper(context, DialogInterfaceC1025f.g(context, g10)));
        this.f1861a = g10;
    }
}

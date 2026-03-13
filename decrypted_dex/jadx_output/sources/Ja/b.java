package Ja;

import N.InterfaceC0167m;
import N.c0;
import Xa.h;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import no.nordicsemi.android.ble.j;
import o0.C1411H;
import o0.InterfaceC1410G;
import pc.AbstractC1499a;
import r0.InterfaceC1546g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class b implements InterfaceC0167m, j, InterfaceC1546g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3467b;

    public /* synthetic */ b(int i3, int i10) {
        this.f3466a = i10;
        this.f3467b = i3;
    }

    @Override // no.nordicsemi.android.ble.j
    public String a() {
        String string2;
        String string22;
        String string23 = StubApp.getString2(3049);
        String string24 = StubApp.getString2(74);
        int i3 = this.f3467b;
        switch (this.f3466a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(3054));
                sb2.append(Integer.toHexString(i3));
                sb2.append(StubApp.getString2(3055));
                if (i3 == 34) {
                    string2 = StubApp.getString2(3095);
                } else if (i3 == 257) {
                    string2 = StubApp.getString2(3094);
                } else if (i3 == 58) {
                    string2 = StubApp.getString2(3093);
                } else if (i3 != 59) {
                    switch (i3) {
                        case 1:
                            string2 = StubApp.getString2(3091);
                            break;
                        case 2:
                            string2 = StubApp.getString2(3090);
                            break;
                        case 3:
                            string2 = StubApp.getString2(3089);
                            break;
                        case 4:
                            string2 = StubApp.getString2(3088);
                            break;
                        case 5:
                            string2 = StubApp.getString2(3087);
                            break;
                        case 6:
                            string2 = StubApp.getString2(3086);
                            break;
                        case 7:
                            string2 = StubApp.getString2(3085);
                            break;
                        case 8:
                            string2 = StubApp.getString2(3084);
                            break;
                        case 9:
                            string2 = StubApp.getString2(3083);
                            break;
                        case 10:
                            string2 = StubApp.getString2(3082);
                            break;
                        case 11:
                            string2 = StubApp.getString2(3081);
                            break;
                        case 12:
                            string2 = StubApp.getString2(3080);
                            break;
                        case 13:
                            string2 = StubApp.getString2(3079);
                            break;
                        case 14:
                            string2 = StubApp.getString2(3078);
                            break;
                        case 15:
                            string2 = StubApp.getString2(3077);
                            break;
                        case 16:
                            string2 = StubApp.getString2(3076);
                            break;
                        case 17:
                            string2 = StubApp.getString2(3075);
                            break;
                        default:
                            switch (i3) {
                                case 128:
                                    string2 = StubApp.getString2(3074);
                                    break;
                                case 129:
                                    string2 = StubApp.getString2(3073);
                                    break;
                                case 130:
                                    string2 = StubApp.getString2(3072);
                                    break;
                                case 131:
                                    string2 = StubApp.getString2(3071);
                                    break;
                                case 132:
                                    string2 = StubApp.getString2(3070);
                                    break;
                                case 133:
                                    string2 = StubApp.getString2(3069);
                                    break;
                                case 134:
                                    string2 = StubApp.getString2(3068);
                                    break;
                                case 135:
                                    string2 = StubApp.getString2(3067);
                                    break;
                                case 136:
                                    string2 = StubApp.getString2(3066);
                                    break;
                                case 137:
                                    string2 = StubApp.getString2(3065);
                                    break;
                                case 138:
                                    string2 = StubApp.getString2(3064);
                                    break;
                                case 139:
                                    string2 = StubApp.getString2(3063);
                                    break;
                                case 140:
                                    string2 = StubApp.getString2(3062);
                                    break;
                                case 141:
                                    string2 = StubApp.getString2(3061);
                                    break;
                                case 142:
                                    string2 = StubApp.getString2(3060);
                                    break;
                                case 143:
                                    string2 = StubApp.getString2(3059);
                                    break;
                                default:
                                    switch (i3) {
                                        case 253:
                                            string2 = StubApp.getString2(3058);
                                            break;
                                        case 254:
                                            string2 = StubApp.getString2(3057);
                                            break;
                                        case 255:
                                            string2 = StubApp.getString2(3056);
                                            break;
                                        default:
                                            string2 = h.g(i3, string23, string24);
                                            break;
                                    }
                            }
                    }
                } else {
                    string2 = StubApp.getString2(3092);
                }
                sb2.append(string2);
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(3050));
                char[] cArr = AbstractC1499a.f19808a;
                switch (i3) {
                    case 10:
                        string22 = StubApp.getString2(3053);
                        break;
                    case 11:
                        string22 = StubApp.getString2(3052);
                        break;
                    case 12:
                        string22 = StubApp.getString2(3051);
                        break;
                    default:
                        string22 = h.g(i3, string23, string24);
                        break;
                }
                sb3.append(string22);
                sb3.append(StubApp.getString2(1561));
                sb3.append(i3);
                sb3.append(string24);
                return sb3.toString();
        }
    }

    @Override // N.InterfaceC0167m
    public c0 d(View view, c0 c0Var) {
        Bitmap.CompressFormat compressFormat = UCropActivity.f12959w0;
        F.c f10 = c0Var.f4771a.f(519);
        int i3 = f10.f2165a;
        int i10 = f10.f2167c;
        int i11 = f10.f2168d;
        view.setPaddingRelative(i3, 0, i10, i11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i12 = this.f3467b + i11;
        if (layoutParams.height != i12) {
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
        }
        return c0Var;
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        switch (this.f3466a) {
            case 3:
                ((InterfaceC1410G) obj).q(this.f3467b);
                break;
            default:
                w0.h hVar = (w0.h) obj;
                hVar.getClass();
                int i3 = this.f3467b;
                if (i3 == 1) {
                    hVar.f22034u = true;
                }
                hVar.f22024k = i3;
                break;
        }
    }

    public /* synthetic */ b(w0.a aVar, int i3, C1411H c1411h, C1411H c1411h2) {
        this.f3466a = 4;
        this.f3467b = i3;
    }
}

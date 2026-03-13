package Dc;

import Z9.H;
import Z9.I;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.stub.StubApp;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class B implements n1.b {

    /* renamed from: a, reason: collision with root package name */
    public int f1539a;

    /* renamed from: b, reason: collision with root package name */
    public int f1540b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1541c;

    public B(int i3) {
        switch (i3) {
            case 6:
                this.f1541c = new int[256];
                break;
            default:
                this.f1541c = new B[256];
                this.f1539a = 0;
                this.f1540b = 0;
                break;
        }
    }

    public static Number g(int i3, X5.a aVar) {
        if (i3 == 28) {
            return Integer.valueOf((short) aVar.g());
        }
        if (i3 >= 32 && i3 <= 246) {
            return Integer.valueOf(i3 - 139);
        }
        if (i3 >= 247 && i3 <= 250) {
            return Integer.valueOf(((i3 - 247) * 256) + aVar.f() + 108);
        }
        if (i3 >= 251 && i3 <= 254) {
            return Integer.valueOf((((-(i3 - 251)) * 256) - aVar.f()) - 108);
        }
        if (i3 != 255) {
            throw new IllegalArgumentException();
        }
        return Double.valueOf(((short) aVar.g()) + (aVar.g() / 65535.0d));
    }

    @Override // n1.b
    public int a() {
        return this.f1539a;
    }

    @Override // n1.b
    public int b() {
        return this.f1540b;
    }

    @Override // n1.b
    public int c() {
        int i3 = this.f1539a;
        return i3 == -1 ? ((C1553n) this.f1541c).y() : i3;
    }

    public List d(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z2) {
        if (z2) {
            this.f1539a = 0;
            this.f1540b = 0;
            this.f1541c = new ArrayList();
        }
        X5.a aVar = new X5.a(bArr);
        boolean z10 = bArr3 != null && bArr3.length > 0;
        boolean z11 = bArr2 != null && bArr2.length > 0;
        while (aVar.f8409b < aVar.f8408a.length) {
            int f10 = aVar.f();
            int i3 = 32768;
            if (f10 == 10 && z10) {
                ArrayList arrayList = (ArrayList) this.f1541c;
                Integer num = (Integer) arrayList.remove(arrayList.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i3 = 107;
                } else if (length < 33900) {
                    i3 = 1131;
                }
                int intValue = num.intValue() + i3;
                if (intValue < bArr3.length) {
                    d(bArr3[intValue], bArr2, bArr3, false);
                    Object j = i2.u.j(1, (ArrayList) this.f1541c);
                    if ((j instanceof I) && ((I) j).f9087a.f9084a[0] == 11) {
                        ArrayList arrayList2 = (ArrayList) this.f1541c;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                }
            } else if (f10 == 29 && z11) {
                ArrayList arrayList3 = (ArrayList) this.f1541c;
                Integer num2 = (Integer) arrayList3.remove(arrayList3.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i3 = 107;
                } else if (length2 < 33900) {
                    i3 = 1131;
                }
                int intValue2 = num2.intValue() + i3;
                if (intValue2 < bArr2.length) {
                    d(bArr2[intValue2], bArr2, bArr3, false);
                    Object j3 = i2.u.j(1, (ArrayList) this.f1541c);
                    if ((j3 instanceof I) && ((I) j3).f9087a.f9084a[0] == 11) {
                        ArrayList arrayList4 = (ArrayList) this.f1541c;
                        arrayList4.remove(arrayList4.size() - 1);
                    }
                }
            } else if (f10 >= 0 && f10 <= 27) {
                ((ArrayList) this.f1541c).add(f(f10, aVar));
            } else if (f10 == 28) {
                ((ArrayList) this.f1541c).add(g(f10, aVar));
            } else if (f10 >= 29 && f10 <= 31) {
                ((ArrayList) this.f1541c).add(f(f10, aVar));
            } else {
                if (f10 < 32 || f10 > 255) {
                    throw new IllegalArgumentException();
                }
                ((ArrayList) this.f1541c).add(g(f10, aVar));
            }
        }
        return (ArrayList) this.f1541c;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        int size = ((ArrayList) this.f1541c).size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            Object obj = ((ArrayList) this.f1541c).get(size);
            if (!(obj instanceof Number)) {
                break;
            }
            arrayList.add(0, (Number) obj);
        }
        return arrayList;
    }

    public I f(int i3, X5.a aVar) {
        if (i3 == 1 || i3 == 18) {
            this.f1539a = (e().size() / 2) + this.f1539a;
        } else if (i3 == 3 || i3 == 19 || i3 == 20 || i3 == 23) {
            this.f1540b = (e().size() / 2) + this.f1540b;
        }
        if (i3 == 12) {
            return new I(i3, aVar.f());
        }
        if (i3 != 19 && i3 != 20) {
            return new I(i3);
        }
        int i10 = this.f1539a + this.f1540b;
        int i11 = i10 / 8;
        if (i10 % 8 > 0) {
            i11++;
        }
        int i12 = i11 + 1;
        int[] iArr = new int[i12];
        iArr[0] = i3;
        for (int i13 = 1; i13 < i12; i13++) {
            iArr[i13] = aVar.f();
        }
        I i14 = new I();
        H h2 = new H();
        h2.f9084a = iArr;
        i14.f9087a = h2;
        return i14;
    }

    public void h(byte[] bArr) {
        int[] iArr;
        this.f1539a = 0;
        this.f1540b = 0;
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException(StubApp.getString2(25091));
        }
        int i3 = 0;
        while (true) {
            iArr = (int[]) this.f1541c;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = i3;
            i3++;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = bArr[i10];
            if (i13 < 0) {
                i13 += 256;
            }
            int i14 = iArr[i12];
            i11 = ((i13 + i14) + i11) % 256;
            iArr[i12] = iArr[i11];
            iArr[i11] = i14;
            i10 = (i10 + 1) % bArr.length;
        }
    }

    public void i(byte b2, OutputStream outputStream) {
        int i3 = (this.f1539a + 1) % 256;
        this.f1539a = i3;
        int[] iArr = (int[]) this.f1541c;
        int i10 = iArr[i3];
        int i11 = (this.f1540b + i10) % 256;
        this.f1540b = i11;
        iArr[i3] = iArr[i11];
        iArr[i11] = i10;
        outputStream.write(b2 ^ ((byte) iArr[(iArr[i3] + i10) % 256]));
    }

    public synchronized int j() {
        PackageInfo packageInfo;
        if (this.f1539a == 0) {
            try {
                packageInfo = Y3.c.a((Context) this.f1541c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w(StubApp.getString2("14196"), StubApp.getString2("1476").concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1539a = packageInfo.versionCode;
            }
        }
        return this.f1539a;
    }

    public synchronized int k() {
        int i3 = this.f1540b;
        if (i3 != 0) {
            return i3;
        }
        Context context = (Context) this.f1541c;
        PackageManager packageManager = context.getPackageManager();
        Y3.b a3 = Y3.c.a(context);
        if (a3.f8739a.getPackageManager().checkPermission(StubApp.getString2("1477"), StubApp.getString2("0")) == -1) {
            Log.e(StubApp.getString2("14196"), StubApp.getString2("1478"));
            return 0;
        }
        Intent intent = new Intent(StubApp.getString2("1479"));
        intent.setPackage(StubApp.getString2("0"));
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            this.f1540b = 2;
            return 2;
        }
        Log.w(StubApp.getString2("14196"), StubApp.getString2("1480"));
        this.f1540b = 2;
        return 2;
    }
}

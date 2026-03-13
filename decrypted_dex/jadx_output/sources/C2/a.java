package C2;

import Z9.I;
import android.util.Log;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1046b;

    public /* synthetic */ a(String str, String str2, boolean z2) {
        this.f1045a = str;
        this.f1046b = str2;
    }

    public static Integer b(ArrayList arrayList) {
        Object remove = arrayList.remove(arrayList.size() - 1);
        if (remove instanceof Integer) {
            return (Integer) remove;
        }
        I i3 = (I) remove;
        int[] iArr = i3.f9087a.f9084a;
        if (iArr[0] == 12 && iArr[1] == 12) {
            return Integer.valueOf(((Integer) arrayList.remove(arrayList.size() - 1)).intValue() / ((Integer) arrayList.remove(arrayList.size() - 1)).intValue());
        }
        throw new IOException(StubApp.getString2(947) + i3.f9087a);
    }

    public void a(byte[] bArr, ArrayList arrayList, ArrayList arrayList2) {
        Integer valueOf;
        X5.a aVar = new X5.a(bArr);
        while (aVar.f8409b < aVar.f8408a.length) {
            int f10 = aVar.f();
            String str = this.f1045a;
            String str2 = this.f1046b;
            String string2 = StubApp.getString2(948);
            if (f10 == 10) {
                Object remove = arrayList2.remove(arrayList2.size() - 1);
                boolean z2 = remove instanceof Integer;
                String string22 = StubApp.getString2(949);
                if (z2) {
                    Integer num = (Integer) remove;
                    if (num.intValue() < 0 || num.intValue() >= arrayList.size()) {
                        Log.w(string2, StubApp.getString2(952) + num + StubApp.getString2(953) + arrayList.size() + StubApp.getString2(954) + str2 + string22 + str);
                        while (u.j(1, arrayList2) instanceof Integer) {
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    } else {
                        a((byte[]) arrayList.get(num.intValue()), arrayList, arrayList2);
                        Object obj = arrayList2.get(arrayList2.size() - 1);
                        if ((obj instanceof I) && ((I) obj).f9087a.f9084a[0] == 11) {
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                } else {
                    Log.w(string2, StubApp.getString2(950) + remove + StubApp.getString2(951) + str2 + string22 + str);
                }
            } else if (f10 == 12 && aVar.a(0) == 16) {
                aVar.c();
                Integer num2 = (Integer) arrayList2.remove(arrayList2.size() - 1);
                Integer num3 = (Integer) arrayList2.remove(arrayList2.size() - 1);
                ArrayDeque arrayDeque = new ArrayDeque();
                int intValue = num2.intValue();
                if (intValue == 0) {
                    arrayDeque.push(b(arrayList2));
                    arrayDeque.push(b(arrayList2));
                    arrayList2.remove(arrayList2.size() - 1);
                    arrayList2.add(0);
                    arrayList2.add(new I(12, 16));
                } else if (intValue == 1) {
                    arrayList2.add(1);
                    arrayList2.add(new I(12, 16));
                } else if (intValue != 3) {
                    for (int i3 = 0; i3 < num3.intValue(); i3++) {
                        arrayDeque.push(b(arrayList2));
                    }
                } else {
                    arrayDeque.push(b(arrayList2));
                }
                while (aVar.a(0) == 12 && aVar.a(1) == 17) {
                    aVar.c();
                    aVar.c();
                    arrayList2.add(arrayDeque.pop());
                }
                if (arrayDeque.size() > 0) {
                    Log.w(string2, StubApp.getString2(955) + str2 + StubApp.getString2(956) + str);
                }
            } else if (f10 >= 0 && f10 <= 31) {
                arrayList2.add(f10 == 12 ? new I(f10, aVar.f()) : new I(f10));
            } else {
                if (f10 < 32 || f10 > 255) {
                    throw new IllegalArgumentException();
                }
                if (f10 >= 32 && f10 <= 246) {
                    valueOf = Integer.valueOf(f10 - 139);
                } else if (f10 >= 247 && f10 <= 250) {
                    valueOf = Integer.valueOf(((f10 - 247) * 256) + aVar.f() + 108);
                } else if (f10 >= 251 && f10 <= 254) {
                    valueOf = Integer.valueOf((((-(f10 - 251)) * 256) - aVar.f()) - 108);
                } else {
                    if (f10 != 255) {
                        throw new IllegalArgumentException();
                    }
                    valueOf = Integer.valueOf(aVar.e());
                }
                arrayList2.add(valueOf);
            }
        }
    }

    public a(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f1045a = title;
        this.f1046b = str;
    }
}

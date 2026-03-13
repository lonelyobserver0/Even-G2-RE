package Uc;

import Xa.AbstractActivityC0364d;
import Ya.d;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class b implements MethodChannel.MethodCallHandler, InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public a f7629a;

    /* renamed from: b, reason: collision with root package name */
    public eb.b f7630b;

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        d dVar = (d) bVar;
        a aVar = new a(dVar.f8882a);
        this.f7629a = aVar;
        this.f7630b = bVar;
        dVar.a(aVar);
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        new MethodChannel(c0824a.f13554b, StubApp.getString2(25711)).setMethodCallHandler(this);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        ((d) this.f7630b).c(this.f7629a);
        this.f7630b = null;
        this.f7629a = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        String str2;
        Double d8;
        Double d10;
        File file;
        String str3;
        String str4;
        String str5;
        Integer num;
        Integer num2;
        if (!methodCall.method.equals(StubApp.getString2(25712))) {
            if (methodCall.method.equals(StubApp.getString2(25743))) {
                SharedPreferences sharedPreferences = this.f7629a.f7626b;
                String string2 = StubApp.getString2(25709);
                if (sharedPreferences.contains(string2)) {
                    str = sharedPreferences.getString(string2, "");
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(string2);
                    edit.apply();
                } else {
                    str = null;
                }
                result.success(str);
                return;
            }
            return;
        }
        a aVar = this.f7629a;
        aVar.getClass();
        String str6 = (String) methodCall.argument(StubApp.getString2(25713));
        Integer num3 = (Integer) methodCall.argument(StubApp.getString2(13068));
        Integer num4 = (Integer) methodCall.argument(StubApp.getString2(13058));
        String string22 = StubApp.getString2(25714);
        Double d11 = (Double) methodCall.argument(string22);
        String string23 = StubApp.getString2(25715);
        Double d12 = (Double) methodCall.argument(string23);
        String str7 = (String) methodCall.argument(StubApp.getString2(25716));
        Integer num5 = (Integer) methodCall.argument(StubApp.getString2(25717));
        ArrayList arrayList = (ArrayList) methodCall.argument(StubApp.getString2(25718));
        String str8 = (String) methodCall.argument(StubApp.getString2(25719));
        String str9 = (String) methodCall.argument(StubApp.getString2(25720));
        aVar.f7628d = result;
        AbstractActivityC0364d abstractActivityC0364d = aVar.f7625a;
        File cacheDir = abstractActivityC0364d.getCacheDir();
        String string24 = StubApp.getString2(25721);
        boolean equals = string24.equals(str7);
        String string25 = StubApp.getString2(25722);
        if (equals) {
            d8 = d11;
            d10 = d12;
            StringBuilder sb2 = new StringBuilder(string25);
            str2 = string22;
            sb2.append(new Date().getTime());
            sb2.append(StubApp.getString2(22310));
            file = new File(cacheDir, sb2.toString());
            str3 = string23;
        } else {
            str2 = string22;
            d8 = d11;
            d10 = d12;
            StringBuilder sb3 = new StringBuilder(string25);
            str3 = string23;
            sb3.append(new Date().getTime());
            sb3.append(StubApp.getString2(6772));
            file = new File(cacheDir, sb3.toString());
        }
        Uri fromFile = Uri.fromFile(new File(str6));
        Uri fromFile2 = Uri.fromFile(file);
        Bundle bundle = new Bundle();
        bundle.putString(StubApp.getString2(16386), (string24.equals(str7) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG).name());
        bundle.putInt(StubApp.getString2(16387), num5 != null ? num5.intValue() : 90);
        bundle.putInt(StubApp.getString2(16389), 10000);
        if (StubApp.getString2(5294).equals(str8)) {
            bundle.putBoolean(StubApp.getString2(16394), true);
        }
        String str10 = (String) methodCall.argument(StubApp.getString2(25723));
        Integer num6 = (Integer) methodCall.argument(StubApp.getString2(25724));
        Boolean bool = (Boolean) methodCall.argument(StubApp.getString2(25725));
        Boolean bool2 = (Boolean) methodCall.argument(StubApp.getString2(25726));
        Integer num7 = (Integer) methodCall.argument(StubApp.getString2(25727));
        Integer num8 = (Integer) methodCall.argument(StubApp.getString2(25728));
        Integer num9 = (Integer) methodCall.argument(StubApp.getString2(25729));
        Integer num10 = (Integer) methodCall.argument(StubApp.getString2(25730));
        Integer num11 = (Integer) methodCall.argument(StubApp.getString2(25731));
        Integer num12 = (Integer) methodCall.argument(StubApp.getString2(25732));
        Integer num13 = (Integer) methodCall.argument(StubApp.getString2(25733));
        Integer num14 = (Integer) methodCall.argument(StubApp.getString2(25734));
        Integer num15 = (Integer) methodCall.argument(StubApp.getString2(25735));
        Integer num16 = (Integer) methodCall.argument(StubApp.getString2(25736));
        Boolean bool3 = (Boolean) methodCall.argument(StubApp.getString2(25737));
        Boolean bool4 = (Boolean) methodCall.argument(StubApp.getString2(25738));
        Boolean bool5 = (Boolean) methodCall.argument(StubApp.getString2(25739));
        if (str10 != null) {
            bundle.putString(StubApp.getString2(16379), str10);
        }
        if (num6 != null) {
            bundle.putInt(StubApp.getString2(16374), num6.intValue());
        }
        if (bool != null) {
            bundle.putBoolean(StubApp.getString2(16372), bool.booleanValue());
        }
        if (bool2 != null) {
            bundle.putBoolean(StubApp.getString2(16373), bool2.booleanValue());
        }
        if (num7 != null) {
            bundle.putInt(StubApp.getString2(16376), num7.intValue());
        }
        if (num8 != null) {
            bundle.putInt(StubApp.getString2(16382), num8.intValue());
        }
        if (num9 != null) {
            bundle.putInt(StubApp.getString2(16375), num9.intValue());
        }
        if (num10 != null) {
            bundle.putInt(StubApp.getString2(16393), num10.intValue());
        }
        if (num11 != null) {
            bundle.putInt(StubApp.getString2(16396), num11.intValue());
        }
        if (num12 != null) {
            bundle.putInt(StubApp.getString2(16401), num12.intValue());
        }
        if (num13 != null) {
            bundle.putInt(StubApp.getString2(16397), num13.intValue());
        }
        if (num14 != null) {
            bundle.putInt(StubApp.getString2(16399), num14.intValue());
        }
        if (num15 != null) {
            bundle.putInt(StubApp.getString2(16400), num15.intValue());
        }
        if (num16 != null) {
            bundle.putInt(StubApp.getString2(16402), num16.intValue());
        }
        if (bool3 != null) {
            bundle.putBoolean(StubApp.getString2(16398), bool3.booleanValue());
        }
        if (bool4 != null) {
            bundle.putBoolean(StubApp.getString2(16392), !bool4.booleanValue());
        }
        if (bool5 != null) {
            bundle.putBoolean(StubApp.getString2(16381), bool5.booleanValue());
        }
        if (arrayList != null && str9 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            int i10 = 0;
            while (i3 < arrayList.size()) {
                Map map = (Map) arrayList.get(i3);
                if (map != null) {
                    String string26 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
                    String obj = map.containsKey(string26) ? map.get(string26).toString() : null;
                    String string27 = StubApp.getString2(1485);
                    Object obj2 = map.containsKey(string27) ? map.get(string27) : null;
                    boolean z2 = obj2 instanceof Map;
                    if (z2) {
                        str4 = str2;
                        num = Integer.valueOf(Integer.parseInt(((Map) obj2).get(str4).toString()));
                    } else {
                        str4 = str2;
                        num = null;
                    }
                    if (z2) {
                        str5 = str3;
                        num2 = Integer.valueOf(Integer.parseInt(((Map) obj2).get(str5).toString()));
                    } else {
                        str5 = str3;
                        num2 = null;
                    }
                    La.a aVar2 = (StubApp.getString2(21596).equals(obj) || num == null) ? new La.a(abstractActivityC0364d.getString(2131755234), 0.0f, 1.0f) : new La.a(obj, num.intValue() * 1.0f, num2.intValue() * 1.0f);
                    arrayList2.add(aVar2);
                    if (str9.equals(aVar2.f4379a)) {
                        i10 = i3;
                    }
                } else {
                    str4 = str2;
                    str5 = str3;
                }
                i3++;
                str3 = str5;
                str2 = str4;
            }
            La.a[] aVarArr = (La.a[]) arrayList2.toArray(new La.a[0]);
            if (i10 >= aVarArr.length) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(AbstractC1482f.e(i10, StubApp.getString2(25740), aVarArr.length, StubApp.getString2(25741), StubApp.getString2(25742)));
            }
            bundle.putInt(StubApp.getString2(16384), i10);
            bundle.putParcelableArrayList(StubApp.getString2(16383), new ArrayList<>(Arrays.asList(aVarArr)));
        }
        Intent intent = new Intent();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(StubApp.getString2(16385), fromFile);
        bundle2.putParcelable(StubApp.getString2(3574), fromFile2);
        bundle2.putAll(bundle);
        if (num3 != null && num4 != null) {
            int intValue = num3.intValue();
            int intValue2 = num4.intValue();
            if (intValue < 10) {
                intValue = 10;
            }
            if (intValue2 < 10) {
                intValue2 = 10;
            }
            bundle2.putInt(StubApp.getString2(16405), intValue);
            bundle2.putInt(StubApp.getString2(16406), intValue2);
        }
        if (d8 != null && d10 != null) {
            float floatValue = d8.floatValue();
            float floatValue2 = d10.floatValue();
            bundle2.putFloat(StubApp.getString2(16403), floatValue);
            bundle2.putFloat(StubApp.getString2(16404), floatValue2);
        }
        intent.setClass(abstractActivityC0364d, UCropActivity.class);
        intent.putExtras(bundle2);
        abstractActivityC0364d.startActivityForResult(intent, 69);
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}

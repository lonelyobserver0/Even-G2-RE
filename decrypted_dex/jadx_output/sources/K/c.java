package K;

import H0.C0067j;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.stub.StubApp;
import f5.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import t.C1696i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1696i f3542a = new C1696i(2);

    /* renamed from: b, reason: collision with root package name */
    public static final C0067j f3543b = new C0067j(1);

    public static i a(Context context, List list) {
        Trace.beginSection(u0.A(StubApp.getString2(3099)));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                d dVar = (d) list.get(i3);
                ProviderInfo b2 = b(context.getPackageManager(), dVar, context.getResources());
                if (b2 == null) {
                    return new i();
                }
                arrayList.add(c(context, dVar, b2.authority));
            }
            return new i(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        String string2 = StubApp.getString2(3100);
        String string22 = StubApp.getString2(3101);
        Trace.beginSection(u0.A(StubApp.getString2(3102)));
        try {
            List list = dVar.f3547d;
            String str = dVar.f3544a;
            String str2 = dVar.f3545b;
            if (list == null) {
                list = E.b.h(resources, 0);
            }
            b bVar = new b();
            bVar.f3539a = str;
            bVar.f3540b = str2;
            bVar.f3541c = list;
            C1696i c1696i = f3542a;
            ProviderInfo providerInfo = (ProviderInfo) c1696i.b(bVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException(string22 + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException(string2 + str + StubApp.getString2("3103") + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C0067j c0067j = f3543b;
            Collections.sort(arrayList, c0067j);
            for (int i3 = 0; i3 < list.size(); i3++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                Collections.sort(arrayList2, c0067j);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    c1696i.c(bVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static j[] c(Context context, d dVar, String str) {
        String string2 = StubApp.getString2(1248);
        Trace.beginSection(u0.A(StubApp.getString2(3104)));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(string2).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(string2).authority(str).appendPath(StubApp.getString2("3105")).build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {StubApp.getString2("2829"), StubApp.getString2("3106"), StubApp.getString2("3107"), StubApp.getString2("3108"), StubApp.getString2("3109"), StubApp.getString2("3110"), StubApp.getString2("3111")};
                Trace.beginSection(u0.A(StubApp.getString2("3112")));
                try {
                    String[] strArr2 = {dVar.f3546c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e10) {
                            Log.w(StubApp.getString2("3113"), StubApp.getString2("3114"), e10);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex(StubApp.getString2("3111"));
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex(StubApp.getString2("2829"));
                        int columnIndex3 = cursor.getColumnIndex(StubApp.getString2("3106"));
                        int columnIndex4 = cursor.getColumnIndex(StubApp.getString2("3107"));
                        int columnIndex5 = cursor.getColumnIndex(StubApp.getString2("3109"));
                        int columnIndex6 = cursor.getColumnIndex(StubApp.getString2("3110"));
                        while (cursor.moveToNext()) {
                            int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            arrayList2.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i3));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (j[]) arrayList.toArray(new j[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}

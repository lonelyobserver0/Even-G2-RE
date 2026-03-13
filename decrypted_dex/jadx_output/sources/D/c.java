package D;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c extends ContentProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1217d = {StubApp.getString2(1245), StubApp.getString2(1246)};

    /* renamed from: e, reason: collision with root package name */
    public static final File f1218e = new File(StubApp.getString2(601));

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f1219f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1220a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f1221b;

    /* renamed from: c, reason: collision with root package name */
    public b f1222c;

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static b c(Context context, String str) {
        b bVar;
        HashMap hashMap = f1219f;
        synchronized (hashMap) {
            try {
                bVar = (b) hashMap.get(str);
                if (bVar == null) {
                    try {
                        try {
                            bVar = e(context, str);
                            hashMap.put(str, bVar);
                        } catch (IOException e10) {
                            throw new IllegalArgumentException(StubApp.getString2("1247"), e10);
                        }
                    } catch (XmlPullParserException e11) {
                        throw new IllegalArgumentException(StubApp.getString2("1247"), e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static Uri d(Context context, String str, File file) {
        b c10 = c(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c10.f1216b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (a(canonicalPath).startsWith(a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(E1.a.j(StubApp.getString2(1249), canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            String string2 = StubApp.getString2(601);
            return new Uri.Builder().scheme(StubApp.getString2(1248)).authority(c10.f1215a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith(string2) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), string2)).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(1242) + file);
        }
    }

    public static b e(Context context, String str) {
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(E1.a.j(StubApp.getString2(1261), str));
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), StubApp.getString2(1250));
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException(StubApp.getString2(1260));
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, StubApp.getString2(1251));
                if (StubApp.getString2(1252).equals(name)) {
                    file = f1218e;
                } else if (StubApp.getString2(1253).equals(name)) {
                    file = context.getFilesDir();
                } else if (StubApp.getString2(1254).equals(name)) {
                    file = context.getCacheDir();
                } else if (StubApp.getString2(1255).equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (StubApp.getString2(1256).equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if (StubApp.getString2(1257).equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if (StubApp.getString2(1258).equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        file = externalMediaDirs[0];
                    }
                }
                if (file == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException(StubApp.getString2(1259));
                    }
                    try {
                        bVar.f1216b.put(attributeValue, file.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException(StubApp.getString2(1242) + file, e10);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException(StubApp.getString2(1265));
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException(StubApp.getString2(1264));
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException(StubApp.getString2(1263));
        }
        String str2 = providerInfo.authority.split(StubApp.getString2(1262))[0];
        synchronized (this.f1220a) {
            this.f1221b = str2;
        }
        HashMap hashMap = f1219f;
        synchronized (hashMap) {
            hashMap.remove(str2);
        }
    }

    public final b b() {
        b bVar;
        synchronized (this.f1220a) {
            try {
                String str = this.f1221b;
                String string2 = StubApp.getString2("1266");
                if (str == null) {
                    throw new NullPointerException(string2);
                }
                if (this.f1222c == null) {
                    this.f1222c = c(getContext(), this.f1221b);
                }
                bVar = this.f1222c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File a3 = b().a(uri);
        int lastIndexOf = a3.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a3.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return StubApp.getString2(1267);
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return StubApp.getString2(1267);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(StubApp.getString2(1268));
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i3;
        File a3 = b().a(uri);
        if (StubApp.getString2(1269).equals(str)) {
            i3 = 268435456;
        } else if (StubApp.getString2(1270).equals(str) || StubApp.getString2(1271).equals(str)) {
            i3 = 738197504;
        } else if (StubApp.getString2(1272).equals(str)) {
            i3 = 704643072;
        } else if (StubApp.getString2(1273).equals(str)) {
            i3 = 939524096;
        } else {
            if (!StubApp.getString2(1274).equals(str)) {
                throw new IllegalArgumentException(E1.a.j(StubApp.getString2(1275), str));
            }
            i3 = 1006632960;
        }
        return ParcelFileDescriptor.open(a3, i3);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i3;
        File a3 = b().a(uri);
        String queryParameter = uri.getQueryParameter(StubApp.getString2(1276));
        if (strArr == null) {
            strArr = f1217d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str3 : strArr) {
            String string2 = StubApp.getString2(1245);
            if (string2.equals(str3)) {
                strArr3[i10] = string2;
                i3 = i10 + 1;
                objArr[i10] = queryParameter == null ? a3.getName() : queryParameter;
            } else {
                String string22 = StubApp.getString2(1246);
                if (string22.equals(str3)) {
                    strArr3[i10] = string22;
                    i3 = i10 + 1;
                    objArr[i10] = Long.valueOf(a3.length());
                }
            }
            i10 = i3;
        }
        String[] strArr4 = new String[i10];
        System.arraycopy(strArr3, 0, strArr4, 0, i10);
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(StubApp.getString2(1277));
    }
}

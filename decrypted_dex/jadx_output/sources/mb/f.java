package mb;

import Xa.AbstractActivityC0364d;
import Z9.C0366a;
import a0.C0379a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import com.stub.StubApp;
import f4.C0879c;
import f4.C0882f;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l4.C1221y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f17302a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0364d f17303b;

    /* renamed from: c, reason: collision with root package name */
    public final C0366a f17304c;

    /* renamed from: d, reason: collision with root package name */
    public final C0882f f17305d;

    /* renamed from: e, reason: collision with root package name */
    public final C0379a f17306e;

    /* renamed from: f, reason: collision with root package name */
    public final C0879c f17307f;

    /* renamed from: g, reason: collision with root package name */
    public final C1221y f17308g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f17309h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public Uri f17310k;

    /* renamed from: l, reason: collision with root package name */
    public a5.c f17311l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f17312m;

    public f(AbstractActivityC0364d abstractActivityC0364d, C0366a c0366a, C0882f c0882f) {
        C0379a c0379a = new C0379a(abstractActivityC0364d, 18);
        C0879c c0879c = new C0879c(abstractActivityC0364d);
        C1221y c1221y = new C1221y(19);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f17312m = new Object();
        this.f17303b = abstractActivityC0364d;
        this.f17304c = c0366a;
        this.f17302a = abstractActivityC0364d.getPackageName() + StubApp.getString2(21183);
        this.f17306e = c0379a;
        this.f17307f = c0879c;
        this.f17308g = c1221y;
        this.f17305d = c0882f;
        this.f17309h = newSingleThreadExecutor;
    }

    public static void a(w wVar) {
        wVar.b(new m(StubApp.getString2(4493), StubApp.getString2(21184)));
    }

    public final void b(String str, String str2) {
        w wVar;
        synchronized (this.f17312m) {
            a5.c cVar = this.f17311l;
            wVar = cVar != null ? (w) cVar.f9284d : null;
            this.f17311l = null;
        }
        if (wVar == null) {
            this.f17305d.k(null, str, str2);
        } else {
            wVar.b(new m(str, str2));
        }
    }

    public final void c(ArrayList arrayList) {
        w wVar;
        synchronized (this.f17312m) {
            a5.c cVar = this.f17311l;
            wVar = cVar != null ? (w) cVar.f9284d : null;
            this.f17311l = null;
        }
        if (wVar == null) {
            this.f17305d.k(arrayList, null, null);
        } else {
            wVar.a(arrayList);
        }
    }

    public final void d(String str) {
        w wVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f17312m) {
            a5.c cVar = this.f17311l;
            wVar = cVar != null ? (w) cVar.f9284d : null;
            this.f17311l = null;
        }
        if (wVar != null) {
            wVar.a(arrayList);
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.f17305d.k(arrayList, null, null);
        }
    }

    public final ArrayList e(Intent intent, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        C1221y c1221y = this.f17308g;
        AbstractActivityC0364d abstractActivityC0364d = this.f17303b;
        if (data != null) {
            c1221y.getClass();
            String i3 = C1221y.i(abstractActivityC0364d, data);
            if (i3 != null) {
                arrayList.add(new e(i3, null));
                return arrayList;
            }
        } else if (intent.getClipData() != null) {
            for (int i10 = 0; i10 < intent.getClipData().getItemCount(); i10++) {
                Uri uri = intent.getClipData().getItemAt(i10).getUri();
                if (uri != null) {
                    c1221y.getClass();
                    String i11 = C1221y.i(abstractActivityC0364d, uri);
                    if (i11 != null) {
                        arrayList.add(new e(i11, z2 ? abstractActivityC0364d.getContentResolver().getType(uri) : null));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void f(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        AbstractActivityC0364d abstractActivityC0364d = this.f17303b;
        PackageManager packageManager = abstractActivityC0364d.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, PKIFailureInfo.notAuthorized);
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            abstractActivityC0364d.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
    }

    public final void g(ArrayList arrayList) {
        t tVar;
        synchronized (this.f17312m) {
            a5.c cVar = this.f17311l;
            tVar = cVar != null ? (t) cVar.f9282b : null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        if (tVar == null) {
            while (i3 < arrayList.size()) {
                arrayList2.add(((e) arrayList.get(i3)).f17300a);
                i3++;
            }
            c(arrayList2);
            return;
        }
        while (i3 < arrayList.size()) {
            e eVar = (e) arrayList.get(i3);
            String str = eVar.f17300a;
            String str2 = eVar.f17301b;
            if (str2 == null || !str2.startsWith(StubApp.getString2(21185))) {
                str = this.f17304c.E(eVar.f17300a, tVar.f17345a, tVar.f17346b, tVar.f17347c.intValue());
            }
            arrayList2.add(str);
            i3++;
        }
        c(arrayList2);
    }

    public final void h() {
        Intent intent = new Intent(StubApp.getString2(21186));
        if (this.j == 2) {
            intent.putExtra(StubApp.getString2(21187), 0);
            intent.putExtra(StubApp.getString2(21188), true);
        }
        String string2 = StubApp.getString2(6772);
        String uuid = UUID.randomUUID().toString();
        AbstractActivityC0364d abstractActivityC0364d = this.f17303b;
        File cacheDir = abstractActivityC0364d.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, string2, cacheDir);
            this.f17310k = Uri.parse(StubApp.getString2(21189) + createTempFile.getAbsolutePath());
            Uri d8 = D.c.d((AbstractActivityC0364d) this.f17307f.f13742a, this.f17302a, createTempFile);
            intent.putExtra(StubApp.getString2(295), d8);
            f(intent, d8);
            try {
                try {
                    abstractActivityC0364d.startActivityForResult(intent, 2343);
                } catch (SecurityException e10) {
                    e10.printStackTrace();
                    b(StubApp.getString2(21190), StubApp.getString2(21191));
                }
            } catch (ActivityNotFoundException unused) {
                createTempFile.delete();
                b(StubApp.getString2(21190), StubApp.getString2(21191));
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void i() {
        C1291A c1291a;
        Long l9;
        Intent intent = new Intent(StubApp.getString2(21192));
        synchronized (this.f17312m) {
            a5.c cVar = this.f17311l;
            c1291a = cVar != null ? (C1291A) cVar.f9283c : null;
        }
        if (c1291a != null && (l9 = c1291a.f17289a) != null) {
            intent.putExtra(StubApp.getString2(21193), l9.intValue());
        }
        if (this.j == 2) {
            intent.putExtra(StubApp.getString2(21187), 0);
            intent.putExtra(StubApp.getString2(21188), true);
        }
        String string2 = StubApp.getString2(21194);
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.f17303b.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, string2, cacheDir);
            this.f17310k = Uri.parse(StubApp.getString2(21189) + createTempFile.getAbsolutePath());
            Uri d8 = D.c.d((AbstractActivityC0364d) this.f17307f.f13742a, this.f17302a, createTempFile);
            intent.putExtra(StubApp.getString2(295), d8);
            f(intent, d8);
            try {
                try {
                    this.f17303b.startActivityForResult(intent, 2353);
                } catch (ActivityNotFoundException unused) {
                    createTempFile.delete();
                    b(StubApp.getString2(21190), StubApp.getString2(21191));
                }
            } catch (SecurityException e10) {
                e10.printStackTrace();
                b(StubApp.getString2(21190), StubApp.getString2(21191));
            }
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final boolean j() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        C0379a c0379a = this.f17306e;
        if (c0379a == null) {
            return false;
        }
        AbstractActivityC0364d abstractActivityC0364d = (AbstractActivityC0364d) c0379a.f9233b;
        int i3 = Build.VERSION.SDK_INT;
        String string2 = StubApp.getString2(1842);
        try {
            PackageManager packageManager = abstractActivityC0364d.getPackageManager();
            if (i3 >= 33) {
                String packageName = abstractActivityC0364d.getPackageName();
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(abstractActivityC0364d.getPackageName(), 4096);
            }
            return Arrays.asList(packageInfo.requestedPermissions).contains(string2);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final boolean k(t tVar, C1291A c1291a, w wVar) {
        synchronized (this.f17312m) {
            try {
                if (this.f17311l != null) {
                    return false;
                }
                this.f17311l = new a5.c(tVar, c1291a, wVar, 21);
                ((Activity) this.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).edit().clear().apply();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i3, final int i10, final Intent intent) {
        Runnable runnable;
        if (i3 == 2342) {
            final int i11 = 0;
            runnable = new Runnable(this) { // from class: mb.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f17291b;

                {
                    this.f17291b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i11) {
                        case 0:
                            f fVar = this.f17291b;
                            fVar.getClass();
                            if (i10 == -1 && (intent2 = intent) != null) {
                                ArrayList e10 = fVar.e(intent2, false);
                                if (e10 != null) {
                                    fVar.g(e10);
                                    break;
                                } else {
                                    fVar.b(StubApp.getString2(21180), StubApp.getString2(21181));
                                    break;
                                }
                            } else {
                                fVar.d(null);
                                break;
                            }
                        case 1:
                            f fVar2 = this.f17291b;
                            fVar2.getClass();
                            if (i10 == -1 && (intent3 = intent) != null) {
                                ArrayList e11 = fVar2.e(intent3, false);
                                if (e11 != null) {
                                    fVar2.g(e11);
                                    break;
                                } else {
                                    fVar2.b(StubApp.getString2(21178), StubApp.getString2(21179));
                                    break;
                                }
                            } else {
                                fVar2.d(null);
                                break;
                            }
                        case 2:
                            f fVar3 = this.f17291b;
                            fVar3.getClass();
                            if (i10 == -1 && (intent4 = intent) != null) {
                                ArrayList e12 = fVar3.e(intent4, false);
                                if (e12 != null) {
                                    fVar3.g(e12);
                                    break;
                                } else {
                                    fVar3.b(StubApp.getString2(21176), StubApp.getString2(21177));
                                    break;
                                }
                            } else {
                                fVar3.d(null);
                                break;
                            }
                        case 3:
                            f fVar4 = this.f17291b;
                            fVar4.getClass();
                            if (i10 == -1 && (intent5 = intent) != null) {
                                ArrayList e13 = fVar4.e(intent5, true);
                                if (e13 != null) {
                                    fVar4.g(e13);
                                    break;
                                } else {
                                    fVar4.b(StubApp.getString2(21174), StubApp.getString2(21175));
                                    break;
                                }
                            } else {
                                fVar4.d(null);
                                break;
                            }
                        default:
                            f fVar5 = this.f17291b;
                            fVar5.getClass();
                            if (i10 == -1 && (intent6 = intent) != null) {
                                ArrayList e14 = fVar5.e(intent6, false);
                                if (e14 != null && e14.size() >= 1) {
                                    fVar5.d(((e) e14.get(0)).f17300a);
                                    break;
                                } else {
                                    fVar5.b(StubApp.getString2(21172), StubApp.getString2(21173));
                                    break;
                                }
                            } else {
                                fVar5.d(null);
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (i3 == 2343) {
            final int i12 = 0;
            runnable = new Runnable(this) { // from class: mb.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f17295b;

                {
                    this.f17295b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            f fVar = this.f17295b;
                            if (i10 != -1) {
                                fVar.d(null);
                                break;
                            } else {
                                Uri uri = fVar.f17310k;
                                if (uri == null) {
                                    uri = Uri.parse(((Activity) fVar.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).getString(StubApp.getString2(21182), ""));
                                }
                                final c cVar = new c(fVar, 0);
                                C0879c c0879c = fVar.f17307f;
                                c0879c.getClass();
                                MediaScannerConnection.scanFile((AbstractActivityC0364d) c0879c.f13742a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: mb.d
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri2) {
                                        t tVar;
                                        c cVar2 = c.this;
                                        int i13 = cVar2.f17297a;
                                        f fVar2 = cVar2.f17298b;
                                        switch (i13) {
                                            case 0:
                                                synchronized (fVar2.f17312m) {
                                                    a5.c cVar3 = fVar2.f17311l;
                                                    tVar = cVar3 != null ? (t) cVar3.f9282b : null;
                                                }
                                                if (tVar == null) {
                                                    fVar2.d(str);
                                                    return;
                                                }
                                                String E10 = fVar2.f17304c.E(str, tVar.f17345a, tVar.f17346b, tVar.f17347c.intValue());
                                                if (E10 != null && !E10.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                fVar2.d(E10);
                                                return;
                                            default:
                                                fVar2.d(str);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        default:
                            f fVar2 = this.f17295b;
                            if (i10 != -1) {
                                fVar2.d(null);
                                break;
                            } else {
                                Uri uri2 = fVar2.f17310k;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(((Activity) fVar2.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).getString(StubApp.getString2(21182), ""));
                                }
                                final c cVar2 = new c(fVar2, 1);
                                C0879c c0879c2 = fVar2.f17307f;
                                c0879c2.getClass();
                                MediaScannerConnection.scanFile((AbstractActivityC0364d) c0879c2.f13742a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: mb.d
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        t tVar;
                                        c cVar22 = c.this;
                                        int i13 = cVar22.f17297a;
                                        f fVar22 = cVar22.f17298b;
                                        switch (i13) {
                                            case 0:
                                                synchronized (fVar22.f17312m) {
                                                    a5.c cVar3 = fVar22.f17311l;
                                                    tVar = cVar3 != null ? (t) cVar3.f9282b : null;
                                                }
                                                if (tVar == null) {
                                                    fVar22.d(str);
                                                    return;
                                                }
                                                String E10 = fVar22.f17304c.E(str, tVar.f17345a, tVar.f17346b, tVar.f17347c.intValue());
                                                if (E10 != null && !E10.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                fVar22.d(E10);
                                                return;
                                            default:
                                                fVar22.d(str);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                    }
                }
            };
        } else if (i3 == 2352) {
            final int i13 = 4;
            runnable = new Runnable(this) { // from class: mb.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f17291b;

                {
                    this.f17291b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    Intent intent6;
                    switch (i13) {
                        case 0:
                            f fVar = this.f17291b;
                            fVar.getClass();
                            if (i10 == -1 && (intent2 = intent) != null) {
                                ArrayList e10 = fVar.e(intent2, false);
                                if (e10 != null) {
                                    fVar.g(e10);
                                    break;
                                } else {
                                    fVar.b(StubApp.getString2(21180), StubApp.getString2(21181));
                                    break;
                                }
                            } else {
                                fVar.d(null);
                                break;
                            }
                        case 1:
                            f fVar2 = this.f17291b;
                            fVar2.getClass();
                            if (i10 == -1 && (intent3 = intent) != null) {
                                ArrayList e11 = fVar2.e(intent3, false);
                                if (e11 != null) {
                                    fVar2.g(e11);
                                    break;
                                } else {
                                    fVar2.b(StubApp.getString2(21178), StubApp.getString2(21179));
                                    break;
                                }
                            } else {
                                fVar2.d(null);
                                break;
                            }
                        case 2:
                            f fVar3 = this.f17291b;
                            fVar3.getClass();
                            if (i10 == -1 && (intent4 = intent) != null) {
                                ArrayList e12 = fVar3.e(intent4, false);
                                if (e12 != null) {
                                    fVar3.g(e12);
                                    break;
                                } else {
                                    fVar3.b(StubApp.getString2(21176), StubApp.getString2(21177));
                                    break;
                                }
                            } else {
                                fVar3.d(null);
                                break;
                            }
                        case 3:
                            f fVar4 = this.f17291b;
                            fVar4.getClass();
                            if (i10 == -1 && (intent5 = intent) != null) {
                                ArrayList e13 = fVar4.e(intent5, true);
                                if (e13 != null) {
                                    fVar4.g(e13);
                                    break;
                                } else {
                                    fVar4.b(StubApp.getString2(21174), StubApp.getString2(21175));
                                    break;
                                }
                            } else {
                                fVar4.d(null);
                                break;
                            }
                        default:
                            f fVar5 = this.f17291b;
                            fVar5.getClass();
                            if (i10 == -1 && (intent6 = intent) != null) {
                                ArrayList e14 = fVar5.e(intent6, false);
                                if (e14 != null && e14.size() >= 1) {
                                    fVar5.d(((e) e14.get(0)).f17300a);
                                    break;
                                } else {
                                    fVar5.b(StubApp.getString2(21172), StubApp.getString2(21173));
                                    break;
                                }
                            } else {
                                fVar5.d(null);
                                break;
                            }
                            break;
                    }
                }
            };
        } else if (i3 != 2353) {
            switch (i3) {
                case 2346:
                    final int i14 = 1;
                    runnable = new Runnable(this) { // from class: mb.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f17291b;

                        {
                            this.f17291b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i14) {
                                case 0:
                                    f fVar = this.f17291b;
                                    fVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList e10 = fVar.e(intent2, false);
                                        if (e10 != null) {
                                            fVar.g(e10);
                                            break;
                                        } else {
                                            fVar.b(StubApp.getString2(21180), StubApp.getString2(21181));
                                            break;
                                        }
                                    } else {
                                        fVar.d(null);
                                        break;
                                    }
                                case 1:
                                    f fVar2 = this.f17291b;
                                    fVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList e11 = fVar2.e(intent3, false);
                                        if (e11 != null) {
                                            fVar2.g(e11);
                                            break;
                                        } else {
                                            fVar2.b(StubApp.getString2(21178), StubApp.getString2(21179));
                                            break;
                                        }
                                    } else {
                                        fVar2.d(null);
                                        break;
                                    }
                                case 2:
                                    f fVar3 = this.f17291b;
                                    fVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList e12 = fVar3.e(intent4, false);
                                        if (e12 != null) {
                                            fVar3.g(e12);
                                            break;
                                        } else {
                                            fVar3.b(StubApp.getString2(21176), StubApp.getString2(21177));
                                            break;
                                        }
                                    } else {
                                        fVar3.d(null);
                                        break;
                                    }
                                case 3:
                                    f fVar4 = this.f17291b;
                                    fVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList e13 = fVar4.e(intent5, true);
                                        if (e13 != null) {
                                            fVar4.g(e13);
                                            break;
                                        } else {
                                            fVar4.b(StubApp.getString2(21174), StubApp.getString2(21175));
                                            break;
                                        }
                                    } else {
                                        fVar4.d(null);
                                        break;
                                    }
                                default:
                                    f fVar5 = this.f17291b;
                                    fVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList e14 = fVar5.e(intent6, false);
                                        if (e14 != null && e14.size() >= 1) {
                                            fVar5.d(((e) e14.get(0)).f17300a);
                                            break;
                                        } else {
                                            fVar5.b(StubApp.getString2(21172), StubApp.getString2(21173));
                                            break;
                                        }
                                    } else {
                                        fVar5.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2347:
                    final int i15 = 3;
                    runnable = new Runnable(this) { // from class: mb.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f17291b;

                        {
                            this.f17291b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i15) {
                                case 0:
                                    f fVar = this.f17291b;
                                    fVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList e10 = fVar.e(intent2, false);
                                        if (e10 != null) {
                                            fVar.g(e10);
                                            break;
                                        } else {
                                            fVar.b(StubApp.getString2(21180), StubApp.getString2(21181));
                                            break;
                                        }
                                    } else {
                                        fVar.d(null);
                                        break;
                                    }
                                case 1:
                                    f fVar2 = this.f17291b;
                                    fVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList e11 = fVar2.e(intent3, false);
                                        if (e11 != null) {
                                            fVar2.g(e11);
                                            break;
                                        } else {
                                            fVar2.b(StubApp.getString2(21178), StubApp.getString2(21179));
                                            break;
                                        }
                                    } else {
                                        fVar2.d(null);
                                        break;
                                    }
                                case 2:
                                    f fVar3 = this.f17291b;
                                    fVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList e12 = fVar3.e(intent4, false);
                                        if (e12 != null) {
                                            fVar3.g(e12);
                                            break;
                                        } else {
                                            fVar3.b(StubApp.getString2(21176), StubApp.getString2(21177));
                                            break;
                                        }
                                    } else {
                                        fVar3.d(null);
                                        break;
                                    }
                                case 3:
                                    f fVar4 = this.f17291b;
                                    fVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList e13 = fVar4.e(intent5, true);
                                        if (e13 != null) {
                                            fVar4.g(e13);
                                            break;
                                        } else {
                                            fVar4.b(StubApp.getString2(21174), StubApp.getString2(21175));
                                            break;
                                        }
                                    } else {
                                        fVar4.d(null);
                                        break;
                                    }
                                default:
                                    f fVar5 = this.f17291b;
                                    fVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList e14 = fVar5.e(intent6, false);
                                        if (e14 != null && e14.size() >= 1) {
                                            fVar5.d(((e) e14.get(0)).f17300a);
                                            break;
                                        } else {
                                            fVar5.b(StubApp.getString2(21172), StubApp.getString2(21173));
                                            break;
                                        }
                                    } else {
                                        fVar5.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                case 2348:
                    final int i16 = 2;
                    runnable = new Runnable(this) { // from class: mb.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f17291b;

                        {
                            this.f17291b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            Intent intent6;
                            switch (i16) {
                                case 0:
                                    f fVar = this.f17291b;
                                    fVar.getClass();
                                    if (i10 == -1 && (intent2 = intent) != null) {
                                        ArrayList e10 = fVar.e(intent2, false);
                                        if (e10 != null) {
                                            fVar.g(e10);
                                            break;
                                        } else {
                                            fVar.b(StubApp.getString2(21180), StubApp.getString2(21181));
                                            break;
                                        }
                                    } else {
                                        fVar.d(null);
                                        break;
                                    }
                                case 1:
                                    f fVar2 = this.f17291b;
                                    fVar2.getClass();
                                    if (i10 == -1 && (intent3 = intent) != null) {
                                        ArrayList e11 = fVar2.e(intent3, false);
                                        if (e11 != null) {
                                            fVar2.g(e11);
                                            break;
                                        } else {
                                            fVar2.b(StubApp.getString2(21178), StubApp.getString2(21179));
                                            break;
                                        }
                                    } else {
                                        fVar2.d(null);
                                        break;
                                    }
                                case 2:
                                    f fVar3 = this.f17291b;
                                    fVar3.getClass();
                                    if (i10 == -1 && (intent4 = intent) != null) {
                                        ArrayList e12 = fVar3.e(intent4, false);
                                        if (e12 != null) {
                                            fVar3.g(e12);
                                            break;
                                        } else {
                                            fVar3.b(StubApp.getString2(21176), StubApp.getString2(21177));
                                            break;
                                        }
                                    } else {
                                        fVar3.d(null);
                                        break;
                                    }
                                case 3:
                                    f fVar4 = this.f17291b;
                                    fVar4.getClass();
                                    if (i10 == -1 && (intent5 = intent) != null) {
                                        ArrayList e13 = fVar4.e(intent5, true);
                                        if (e13 != null) {
                                            fVar4.g(e13);
                                            break;
                                        } else {
                                            fVar4.b(StubApp.getString2(21174), StubApp.getString2(21175));
                                            break;
                                        }
                                    } else {
                                        fVar4.d(null);
                                        break;
                                    }
                                default:
                                    f fVar5 = this.f17291b;
                                    fVar5.getClass();
                                    if (i10 == -1 && (intent6 = intent) != null) {
                                        ArrayList e14 = fVar5.e(intent6, false);
                                        if (e14 != null && e14.size() >= 1) {
                                            fVar5.d(((e) e14.get(0)).f17300a);
                                            break;
                                        } else {
                                            fVar5.b(StubApp.getString2(21172), StubApp.getString2(21173));
                                            break;
                                        }
                                    } else {
                                        fVar5.d(null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    break;
                default:
                    return false;
            }
        } else {
            final int i17 = 1;
            runnable = new Runnable(this) { // from class: mb.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f17295b;

                {
                    this.f17295b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            f fVar = this.f17295b;
                            if (i10 != -1) {
                                fVar.d(null);
                                break;
                            } else {
                                Uri uri = fVar.f17310k;
                                if (uri == null) {
                                    uri = Uri.parse(((Activity) fVar.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).getString(StubApp.getString2(21182), ""));
                                }
                                final c cVar = new c(fVar, 0);
                                C0879c c0879c = fVar.f17307f;
                                c0879c.getClass();
                                MediaScannerConnection.scanFile((AbstractActivityC0364d) c0879c.f13742a, new String[]{uri != null ? uri.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: mb.d
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        t tVar;
                                        c cVar22 = c.this;
                                        int i132 = cVar22.f17297a;
                                        f fVar22 = cVar22.f17298b;
                                        switch (i132) {
                                            case 0:
                                                synchronized (fVar22.f17312m) {
                                                    a5.c cVar3 = fVar22.f17311l;
                                                    tVar = cVar3 != null ? (t) cVar3.f9282b : null;
                                                }
                                                if (tVar == null) {
                                                    fVar22.d(str);
                                                    return;
                                                }
                                                String E10 = fVar22.f17304c.E(str, tVar.f17345a, tVar.f17346b, tVar.f17347c.intValue());
                                                if (E10 != null && !E10.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                fVar22.d(E10);
                                                return;
                                            default:
                                                fVar22.d(str);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                        default:
                            f fVar2 = this.f17295b;
                            if (i10 != -1) {
                                fVar2.d(null);
                                break;
                            } else {
                                Uri uri2 = fVar2.f17310k;
                                if (uri2 == null) {
                                    uri2 = Uri.parse(((Activity) fVar2.f17305d.f13748b).getSharedPreferences(StubApp.getString2(17487), 0).getString(StubApp.getString2(21182), ""));
                                }
                                final c cVar2 = new c(fVar2, 1);
                                C0879c c0879c2 = fVar2.f17307f;
                                c0879c2.getClass();
                                MediaScannerConnection.scanFile((AbstractActivityC0364d) c0879c2.f13742a, new String[]{uri2 != null ? uri2.getPath() : ""}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: mb.d
                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                    public final void onScanCompleted(String str, Uri uri22) {
                                        t tVar;
                                        c cVar22 = c.this;
                                        int i132 = cVar22.f17297a;
                                        f fVar22 = cVar22.f17298b;
                                        switch (i132) {
                                            case 0:
                                                synchronized (fVar22.f17312m) {
                                                    a5.c cVar3 = fVar22.f17311l;
                                                    tVar = cVar3 != null ? (t) cVar3.f9282b : null;
                                                }
                                                if (tVar == null) {
                                                    fVar22.d(str);
                                                    return;
                                                }
                                                String E10 = fVar22.f17304c.E(str, tVar.f17345a, tVar.f17346b, tVar.f17347c.intValue());
                                                if (E10 != null && !E10.equals(str)) {
                                                    new File(str).delete();
                                                }
                                                fVar22.d(E10);
                                                return;
                                            default:
                                                fVar22.d(str);
                                                return;
                                        }
                                    }
                                });
                                break;
                            }
                    }
                }
            };
        }
        this.f17309h.execute(runnable);
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        boolean z2 = iArr.length > 0 && iArr[0] == 0;
        if (i3 != 2345) {
            if (i3 != 2355) {
                return false;
            }
            if (z2) {
                i();
            }
        } else if (z2) {
            h();
        }
        if (!z2 && (i3 == 2345 || i3 == 2355)) {
            b(StubApp.getString2(21195), StubApp.getString2(21196));
        }
        return true;
    }
}

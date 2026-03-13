package R3;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.stub.StubApp;
import i5.C1059c;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import n4.AbstractC1384b;
import o4.AbstractBinderC1460c;
import o4.C1458a;
import o4.C1461d;
import org.json.JSONException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C extends AbstractBinderC1460c implements Q3.i, Q3.j {

    /* renamed from: m, reason: collision with root package name */
    public static final U3.b f6080m = AbstractC1384b.f17804a;

    /* renamed from: f, reason: collision with root package name */
    public final Context f6081f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.h f6082g;

    /* renamed from: h, reason: collision with root package name */
    public final U3.b f6083h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f6084i;
    public final C1059c j;

    /* renamed from: k, reason: collision with root package name */
    public C1458a f6085k;

    /* renamed from: l, reason: collision with root package name */
    public Ac.e f6086l;

    public C(Context context, c4.h hVar, C1059c c1059c) {
        super(StubApp.getString2(5611), 0);
        this.f6081f = context;
        this.f6082g = hVar;
        this.j = c1059c;
        this.f6084i = (Set) c1059c.f14843b;
        this.f6083h = f6080m;
    }

    @Override // Q3.i
    public final void e(int i3) {
        Ac.e eVar = this.f6086l;
        r rVar = (r) ((C0236e) eVar.f319f).f6131k.get((C0233b) eVar.f316c);
        if (rVar != null) {
            if (rVar.f6155m) {
                rVar.p(new com.google.android.gms.common.b(17));
            } else {
                rVar.e(i3);
            }
        }
    }

    @Override // Q3.i
    public final void f() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        boolean z2 = false;
        C1458a c1458a = this.f6085k;
        c1458a.getClass();
        try {
            c1458a.f18364D.getClass();
            Account account = new Account("<<default account>>", StubApp.getString2("5612"));
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c1458a.f6493c;
                    ReentrantLock reentrantLock = O3.a.f5200c;
                    S3.D.h(context);
                    ReentrantLock reentrantLock2 = O3.a.f5200c;
                    reentrantLock2.lock();
                    try {
                        if (O3.a.f5201d == null) {
                            O3.a.f5201d = new O3.a(StubApp.getOrigApplicationContext(context.getApplicationContext()));
                        }
                        O3.a aVar = O3.a.f5201d;
                        reentrantLock2.unlock();
                        String a3 = aVar.a(StubApp.getString2("5613"));
                        if (!TextUtils.isEmpty(a3)) {
                            String a9 = aVar.a(StubApp.getString2("5614") + a3);
                            if (a9 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.d(a9);
                                } catch (JSONException unused) {
                                }
                                Integer num = c1458a.f18366F;
                                S3.D.h(num);
                                S3.v vVar = new S3.v(2, account, num.intValue(), googleSignInAccount);
                                C1461d c1461d = (C1461d) c1458a.t();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(c1461d.f10821g);
                                int i3 = c4.c.f10823a;
                                obtain.writeInt(1);
                                int I10 = a4.f.I(obtain, 20293);
                                a4.f.P(obtain, 1, 4);
                                obtain.writeInt(1);
                                a4.f.E(obtain, 2, vVar, 0);
                                a4.f.N(obtain, I10);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                c1461d.f10820f.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                c1461d.f10820f.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = c1458a.f18366F;
            S3.D.h(num2);
            S3.v vVar2 = new S3.v(2, account, num2.intValue(), googleSignInAccount);
            C1461d c1461d2 = (C1461d) c1458a.t();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(c1461d2.f10821g);
            int i32 = c4.c.f10823a;
            obtain.writeInt(1);
            int I102 = a4.f.I(obtain, 20293);
            a4.f.P(obtain, 1, 4);
            obtain.writeInt(1);
            a4.f.E(obtain, 2, vVar2, 0);
            a4.f.N(obtain, I102);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e10) {
            String string2 = StubApp.getString2(5615);
            Log.w(string2, StubApp.getString2(5616));
            try {
                this.f6082g.post(new Q4.b(this, new o4.f(1, new com.google.android.gms.common.b(8, null), null), 13, z2));
            } catch (RemoteException unused2) {
                Log.wtf(string2, StubApp.getString2(5617), e10);
            }
        }
    }

    @Override // Q3.j
    public final void g(com.google.android.gms.common.b bVar) {
        this.f6086l.h(bVar);
    }
}

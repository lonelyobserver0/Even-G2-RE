package J1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends Binder implements i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3342e;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3342e = multiInstanceInvalidationService;
        attachInterface(this, i.f3323b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = 0;
        String str = i.f3323b;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        h callback = null;
        h callback2 = null;
        if (i3 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(h.f3322a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                    g gVar = new g();
                    gVar.f3321e = readStrongBinder;
                    callback = gVar;
                } else {
                    callback = (h) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3342e;
                synchronized (multiInstanceInvalidationService.f10343c) {
                    try {
                        int i12 = multiInstanceInvalidationService.f10341a + 1;
                        multiInstanceInvalidationService.f10341a = i12;
                        if (multiInstanceInvalidationService.f10343c.register(callback, Integer.valueOf(i12))) {
                            multiInstanceInvalidationService.f10342b.put(Integer.valueOf(i12), readString);
                            i11 = i12;
                        } else {
                            multiInstanceInvalidationService.f10341a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i11);
            return true;
        }
        if (i3 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(h.f3322a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof h)) {
                    g gVar2 = new g();
                    gVar2.f3321e = readStrongBinder2;
                    callback2 = gVar2;
                } else {
                    callback2 = (h) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            Intrinsics.checkNotNullParameter(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f3342e;
            synchronized (multiInstanceInvalidationService2.f10343c) {
                multiInstanceInvalidationService2.f10343c.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i3 != 3) {
            return super.onTransact(i3, parcel, parcel2, i10);
        }
        int readInt2 = parcel.readInt();
        String[] tables = parcel.createStringArray();
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f3342e;
        synchronized (multiInstanceInvalidationService3.f10343c) {
            String str2 = (String) multiInstanceInvalidationService3.f10342b.get(Integer.valueOf(readInt2));
            if (str2 == null) {
                Log.w(StubApp.getString2("53"), StubApp.getString2("2922"));
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.f10343c.beginBroadcast();
                while (i11 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f10343c.getBroadcastCookie(i11);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.f10342b.get(num);
                        if (readInt2 != intValue && Intrinsics.areEqual(str2, str3)) {
                            try {
                                ((h) multiInstanceInvalidationService3.f10343c.getBroadcastItem(i11)).k(tables);
                            } catch (RemoteException e10) {
                                Log.w(StubApp.getString2("53"), StubApp.getString2("2923"), e10);
                            }
                        }
                        i11++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService3.f10343c.finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService3.f10343c.finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }
        return true;
    }
}

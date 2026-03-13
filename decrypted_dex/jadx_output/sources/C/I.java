package C;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import b.C0473a;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f800a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f801b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f802c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Set f803d = new HashSet();

    public I(Context context) {
        this.f800a = context;
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(761));
        handlerThread.start();
        this.f801b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(H h2) {
        boolean z2;
        ArrayDeque arrayDeque;
        String string2 = StubApp.getString2(762);
        boolean isLoggable = Log.isLoggable(string2, 3);
        ComponentName componentName = h2.f795a;
        if (isLoggable) {
            Log.d(string2, StubApp.getString2(763) + componentName + StubApp.getString2(81) + h2.f798d.size() + StubApp.getString2(764));
        }
        if (h2.f798d.isEmpty()) {
            return;
        }
        if (h2.f796b) {
            z2 = true;
        } else {
            Intent component = new Intent(StubApp.getString2(765)).setComponent(componentName);
            Context context = this.f800a;
            boolean bindService = context.bindService(component, this, 33);
            h2.f796b = bindService;
            if (bindService) {
                h2.f799e = 0;
            } else {
                Log.w(string2, StubApp.getString2(766) + componentName);
                context.unbindService(this);
            }
            z2 = h2.f796b;
        }
        if (!z2 || h2.f797c == null) {
            b(h2);
            return;
        }
        while (true) {
            arrayDeque = h2.f798d;
            F f10 = (F) arrayDeque.peek();
            if (f10 == null) {
                break;
            }
            try {
                if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2("767") + f10);
                }
                f10.a(h2.f797c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2(769) + componentName);
                }
            } catch (RemoteException e10) {
                Log.w(string2, StubApp.getString2(768) + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(h2);
    }

    public final void b(H h2) {
        Handler handler = this.f801b;
        ComponentName componentName = h2.f795a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = h2.f799e;
        int i10 = i3 + 1;
        h2.f799e = i10;
        String string2 = StubApp.getString2(762);
        if (i10 <= 6) {
            int i11 = (1 << i3) * 1000;
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(774) + i11 + StubApp.getString2(559));
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(770));
        ArrayDeque arrayDeque = h2.f798d;
        sb2.append(arrayDeque.size());
        sb2.append(StubApp.getString2(771));
        sb2.append(componentName);
        sb2.append(StubApp.getString2(772));
        sb2.append(h2.f799e);
        sb2.append(StubApp.getString2(773));
        Log.w(string2, sb2.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String string2;
        int i3 = message.what;
        HashMap hashMap = this.f802c;
        b.c cVar = null;
        Context context = this.f800a;
        if (i3 == 0) {
            F f10 = (F) message.obj;
            Set b2 = J.b(context);
            if (!b2.equals(this.f803d)) {
                this.f803d = b2;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(StubApp.getString2(765)), 0);
                HashSet hashSet = new HashSet();
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    string2 = StubApp.getString2(762);
                    if (!hasNext) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    if (((HashSet) b2).contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w(string2, StubApp.getString2(775) + componentName + StubApp.getString2(776));
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it2.next();
                    if (!hashMap.containsKey(componentName2)) {
                        if (Log.isLoggable(string2, 3)) {
                            Log.d(string2, StubApp.getString2(777) + componentName2);
                        }
                        hashMap.put(componentName2, new H(componentName2));
                    }
                }
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(string2, 3)) {
                            Log.d(string2, StubApp.getString2(778) + entry.getKey());
                        }
                        H h2 = (H) entry.getValue();
                        if (h2.f796b) {
                            context.unbindService(this);
                            h2.f796b = false;
                        }
                        h2.f797c = null;
                        it3.remove();
                    }
                }
            }
            for (H h4 : hashMap.values()) {
                h4.f798d.add(f10);
                a(h4);
            }
        } else if (i3 == 1) {
            G g10 = (G) message.obj;
            H h5 = (H) hashMap.get(g10.f793a);
            if (h5 != null) {
                int i10 = b.b.f10400e;
                IBinder iBinder = g10.f794b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.f10401c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) {
                        C0473a c0473a = new C0473a();
                        c0473a.f10399e = iBinder;
                        cVar = c0473a;
                    } else {
                        cVar = (b.c) queryLocalInterface;
                    }
                }
                h5.f797c = cVar;
                h5.f799e = 0;
                a(h5);
                return true;
            }
        } else if (i3 == 2) {
            H h9 = (H) hashMap.get((ComponentName) message.obj);
            if (h9 != null) {
                if (h9.f796b) {
                    context.unbindService(this);
                    h9.f796b = false;
                }
                h9.f797c = null;
                return true;
            }
        } else {
            if (i3 != 3) {
                return false;
            }
            H h10 = (H) hashMap.get((ComponentName) message.obj);
            if (h10 != null) {
                a(h10);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String string2 = StubApp.getString2(762);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(779) + componentName);
        }
        this.f801b.obtainMessage(1, new G(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String string2 = StubApp.getString2(762);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, StubApp.getString2(780) + componentName);
        }
        this.f801b.obtainMessage(2, componentName).sendToTarget();
    }
}

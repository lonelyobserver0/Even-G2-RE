package Q9;

import Z9.C0366a;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m6.l;
import o0.C1428c;
import r0.AbstractC1560u;
import u6.C1775a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5778b;

    public /* synthetic */ c(Object obj, int i3) {
        this.f5777a = i3;
        this.f5778b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] devices) {
        switch (this.f5777a) {
            case 0:
                Intrinsics.checkNotNullParameter(devices, "addedDevices");
                Intrinsics.checkNotNullParameter(devices, "devices");
                ArrayList arrayList = new ArrayList(devices.length);
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    arrayList.add(W.a.i(audioDeviceInfo));
                }
                ((B6.a) this.f5778b).l(StubApp.getString2(5366), arrayList);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(devices, "addedDevices");
                C1775a c1775a = (C1775a) this.f5778b;
                HashSet hashSet = c1775a.f21458e;
                List devices2 = ArraysKt.asList(devices);
                Intrinsics.checkNotNullParameter(devices2, "devices");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : devices2) {
                    AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo2.isSource() && audioDeviceInfo2.getType() != 18 && audioDeviceInfo2.getType() != 25 && audioDeviceInfo2.getType() != 28) {
                        arrayList2.add(obj);
                    }
                }
                hashSet.addAll(arrayList2);
                HashSet hashSet2 = c1775a.f21458e;
                if (hashSet2 == null || !hashSet2.isEmpty()) {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        if (((AudioDeviceInfo) it.next()).getType() == 7) {
                            AudioManager audioManager = c1775a.f21456c;
                            if (audioManager.isBluetoothScoAvailableOffCall() && !audioManager.isBluetoothScoOn()) {
                                audioManager.startBluetoothSco();
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                l lVar = (l) this.f5778b;
                lVar.a(x0.b.c((Context) lVar.f17111c, (C1428c) lVar.j, (C0366a) lVar.f17117i));
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] devices) {
        Set set;
        switch (this.f5777a) {
            case 0:
                Intrinsics.checkNotNullParameter(devices, "removedDevices");
                Intrinsics.checkNotNullParameter(devices, "devices");
                ArrayList arrayList = new ArrayList(devices.length);
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    arrayList.add(W.a.i(audioDeviceInfo));
                }
                ((B6.a) this.f5778b).l(StubApp.getString2(5367), arrayList);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(devices, "removedDevices");
                C1775a c1775a = (C1775a) this.f5778b;
                HashSet hashSet = c1775a.f21458e;
                List devices2 = ArraysKt.asList(devices);
                Intrinsics.checkNotNullParameter(devices2, "devices");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : devices2) {
                    AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) obj;
                    if (audioDeviceInfo2.isSource() && audioDeviceInfo2.getType() != 18 && audioDeviceInfo2.getType() != 25 && audioDeviceInfo2.getType() != 28) {
                        arrayList2.add(obj);
                    }
                }
                set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                hashSet.removeAll(set);
                HashSet hashSet2 = c1775a.f21458e;
                if (hashSet2 == null || !hashSet2.isEmpty()) {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        if (((AudioDeviceInfo) it.next()).getType() == 7) {
                            break;
                        }
                    }
                }
                AudioManager audioManager = c1775a.f21456c;
                if (audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    break;
                }
                break;
            default:
                l lVar = (l) this.f5778b;
                if (AbstractC1560u.k(devices, (C0366a) lVar.f17117i)) {
                    lVar.f17117i = null;
                }
                lVar.a(x0.b.c((Context) lVar.f17111c, (C1428c) lVar.j, (C0366a) lVar.f17117i));
                break;
        }
    }
}

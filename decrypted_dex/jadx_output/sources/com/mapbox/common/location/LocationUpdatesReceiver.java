package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "CircularArray", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LocationUpdatesReceiver extends BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final ConcurrentHashMap<Integer, WeakReference<BaseDeviceLocationProvider>> backgroundDeviceLocationProviders;
    private static final ConcurrentHashMap<Integer, CircularArray<Intent>> pendingIntents;
    public static final String ACTION_PROCESS_LOCATION_UPDATES = StubApp.getString2(13621);
    public static final String LOCATION_PROVIDER_ID_KEY = StubApp.getString2(13622);
    private static final String TAG = StubApp.getString2(13697);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010 \n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0002\u0010\u0019J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", "T", "", "", "capacity", "", "(I)V", "arr", "", "getArr$annotations", "()V", "[Ljava/lang/Object;", "currentSize", "head", "getHead", "()I", "size", "getSize", "tail", "add", "", "item", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "toList", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CircularArray<T> implements Iterable<T>, KMappedMarker {
        private final T[] arr;
        private int currentSize;
        private int tail = -1;

        public CircularArray(int i3) {
            this.arr = (T[]) new Object[i3];
        }

        private static /* synthetic */ void getArr$annotations() {
        }

        private final int getHead() {
            int i3 = this.currentSize;
            if (i3 == this.arr.length) {
                return (this.tail + 1) % i3;
            }
            return 0;
        }

        public final void add(T item) {
            Intrinsics.checkNotNullParameter(item, "item");
            int i3 = this.tail + 1;
            T[] tArr = this.arr;
            int length = i3 % tArr.length;
            this.tail = length;
            tArr[length] = item;
            int i10 = this.currentSize;
            if (i10 < tArr.length) {
                this.currentSize = i10 + 1;
            }
        }

        public final T get(int index) {
            int i3 = this.currentSize;
            if (i3 == 0 || index >= i3 || index < 0) {
                throw new IndexOutOfBoundsException(String.valueOf(index));
            }
            T[] tArr = this.arr;
            T t3 = i3 == tArr.length ? tArr[(getHead() + index) % this.arr.length] : tArr[index];
            Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of com.mapbox.common.location.LocationUpdatesReceiver.CircularArray");
            return t3;
        }

        /* renamed from: getSize, reason: from getter */
        public final int getCurrentSize() {
            return this.currentSize;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new LocationUpdatesReceiver$CircularArray$iterator$1(this);
        }

        public final List<T> toList() {
            return SequencesKt.toList(SequencesKt.asSequence(iterator()));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mapbox/common/location/LocationUpdatesReceiver$Companion;", "", "()V", "ACTION_PROCESS_LOCATION_UPDATES", "", "LOCATION_PROVIDER_ID_KEY", "TAG", "backgroundDeviceLocationProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/ref/WeakReference;", "Lcom/mapbox/common/location/BaseDeviceLocationProvider;", "pendingIntents", "Lcom/mapbox/common/location/LocationUpdatesReceiver$CircularArray;", "Landroid/content/Intent;", "addDeviceLocationProvider", "", "persistentId", "locationProvider", "addDeviceLocationProvider$common_release", "removeDeviceLocationProvider", "removeDeviceLocationProvider$common_release", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addDeviceLocationProvider$common_release(int persistentId, BaseDeviceLocationProvider locationProvider) {
            Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.put(Integer.valueOf(persistentId), new WeakReference(locationProvider));
            CircularArray circularArray = (CircularArray) LocationUpdatesReceiver.pendingIntents.remove(Integer.valueOf(persistentId));
            if (circularArray != null) {
                Iterator it = circularArray.toList().iterator();
                while (it.hasNext()) {
                    List<Location> extractResult = locationProvider.extractResult((Intent) it.next());
                    if (!extractResult.isEmpty()) {
                        locationProvider.notifyLocationUpdate(extractResult);
                    }
                }
            }
        }

        public final void removeDeviceLocationProvider$common_release(int persistentId) {
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.remove(Integer.valueOf(persistentId));
        }

        private Companion() {
        }
    }

    static {
        StubApp.interface11(5616);
        INSTANCE = new Companion(null);
        pendingIntents = new ConcurrentHashMap<>();
        backgroundDeviceLocationProviders = new ConcurrentHashMap<>();
    }

    @Override // android.content.BroadcastReceiver
    public native void onReceive(Context context, Intent intent);
}

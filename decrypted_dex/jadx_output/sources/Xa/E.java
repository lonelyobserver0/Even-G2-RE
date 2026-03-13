package Xa;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    public static E f8515c;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f8516a = new LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f8517b = new PriorityQueue();

    public final MotionEvent a(D d8) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j;
        while (true) {
            priorityQueue = this.f8517b;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = this.f8516a;
            j = d8.f8514a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j) {
                break;
            }
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j);
        longSparseArray.remove(j);
        return motionEvent;
    }
}

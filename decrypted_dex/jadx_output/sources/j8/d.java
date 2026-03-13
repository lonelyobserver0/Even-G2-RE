package j8;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import k8.C1116a;
import kotlin.jvm.functions.Function1;
import u8.AbstractC1780d;
import u8.e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final Gson f15378b = new GsonBuilder().registerTypeAdapterFactory(DirectionsAdapterFactory.a()).registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter()).create();

    /* renamed from: a, reason: collision with root package name */
    public C1116a f15379a;

    public abstract void a(AbstractC1780d abstractC1780d);

    public abstract void b(Function1 function1);

    public abstract void c();
}

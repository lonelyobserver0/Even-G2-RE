package com.mapbox.maps;

import c5.B;
import com.mapbox.common.Cancelable;
import com.stub.StubApp;
import h7.InterfaceC1010a;
import h7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0004µ\u0001¶\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b=\u0010<J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bB\u0010AJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bG\u0010FJ3\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\u00020L2\u0006\u0010P\u001a\u00020O2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0004\bQ\u0010RJ3\u0010V\u001a\u00020L2\u0006\u0010T\u001a\u00020S2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bV\u0010WJ3\u0010[\u001a\u00020L2\u0006\u0010Y\u001a\u00020X2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b[\u0010\\J3\u0010`\u001a\u00020L2\u0006\u0010^\u001a\u00020]2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b`\u0010aJ3\u0010e\u001a\u00020L2\u0006\u0010c\u001a\u00020b2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\be\u0010fJ3\u0010j\u001a\u00020L2\u0006\u0010h\u001a\u00020g2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bj\u0010kJ3\u0010o\u001a\u00020L2\u0006\u0010m\u001a\u00020l2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010%¢\u0006\u0004\bo\u0010pJ3\u0010t\u001a\u00020L2\u0006\u0010r\u001a\u00020q2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010*¢\u0006\u0004\bt\u0010uJ3\u0010y\u001a\u00020L2\u0006\u0010w\u001a\u00020v2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010/¢\u0006\u0004\by\u0010zJ3\u0010~\u001a\u00020L2\u0006\u0010|\u001a\u00020{2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\n\b\u0002\u0010}\u001a\u0004\u0018\u000104¢\u0006\u0004\b~\u0010\u007fJ9\u0010\u0083\u0001\u001a\u00020L2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u000109¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J9\u0010\u0088\u0001\u001a\u00020L2\b\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u0087\u0001\u001a\u0004\u0018\u00010>¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J9\u0010\u008d\u0001\u001a\u00020L2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J2\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010C¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0091\u0001\u001a\u00020L2\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010J¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J8\u0010\u0097\u0001\u001a\u00020L2\b\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010JH\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020\b¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0010\u0010\u009b\u0001\u001a\u00020\b¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\b2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J0\u0010¤\u0001\u001a\u00020\b2\u0007\u0010 \u0001\u001a\u00020\u00012\u0013\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000¡\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¦\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020]0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R#\u0010£\u0001\u001a\u000e\u0012\t\u0012\u00070¢\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010©\u0001R0\u0010«\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0006\b¯\u0001\u0010\u009a\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R#\u0010±\u0001\u001a\u000e\u0012\t\u0012\u00070°\u0001R\u00020\u00000§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010©\u0001R0\u0010²\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020L0ª\u00018\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b²\u0001\u0010¬\u0001\u0012\u0006\b´\u0001\u0010\u009a\u0001\u001a\u0006\b³\u0001\u0010®\u0001¨\u0006·\u0001"}, d2 = {"Lcom/mapbox/maps/NativeObserver;", "", "Lcom/mapbox/maps/NativeMapImpl;", "observable", "<init>", "(Lcom/mapbox/maps/NativeMapImpl;)V", "Lh7/a;", "onCameraChangeListener", "", "addOnCameraChangeListener", "(Lh7/a;)V", "removeOnCameraChangeListener", "Lh7/d;", "onMapLoadedListener", "addOnMapLoadedListener", "(Lh7/d;)V", "removeOnMapLoadedListener", "Lh7/b;", "onMapIdleListener", "addOnMapIdleListener", "(Lh7/b;)V", "removeOnMapIdleListener", "Lh7/c;", "onMapLoadErrorListener", "addOnMapLoadErrorListener", "(Lh7/c;)V", "removeOnMapLoadErrorListener", "Lh7/m;", "onStyleLoadedListener", "addOnStyleLoadedListener", "(Lh7/m;)V", "removeOnStyleLoadedListener", "Lh7/j;", "onStyleDataLoadedListener", "addOnStyleDataLoadedListener", "(Lh7/j;)V", "removeOnStyleDataLoadedListener", "Lh7/h;", "onSourceDataLoadedListener", "addOnSourceDataLoadedListener", "(Lh7/h;)V", "removeOnSourceDataLoadedListener", "Lh7/g;", "onSourceAddedListener", "addOnSourceAddedListener", "(Lh7/g;)V", "removeOnSourceAddedListener", "Lh7/i;", "onSourceRemovedListener", "addOnSourceRemovedListener", "(Lh7/i;)V", "removeOnSourceRemovedListener", "Lh7/k;", "onStyleImageMissingListener", "addOnStyleImageMissingListener", "(Lh7/k;)V", "removeOnStyleImageMissingListener", "Lh7/l;", "onStyleImageUnusedListener", "addOnStyleImageUnusedListener", "(Lh7/l;)V", "removeOnStyleImageUnusedListener", "Lh7/f;", "onRenderFrameStartedListener", "addOnRenderFrameStartedListener", "(Lh7/f;)V", "removeOnRenderFrameStartedListener", "Lh7/e;", "onRenderFrameFinishedListener", "addOnRenderFrameFinishedListener", "(Lh7/e;)V", "removeOnRenderFrameFinishedListener", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "Lkotlin/Function0;", "onCancel", "Lcom/mapbox/common/Cancelable;", "subscribeCameraChanged", "(Lcom/mapbox/maps/CameraChangedCallback;Lkotlin/jvm/functions/Function0;Lh7/a;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "subscribeCameraChangedCoalesced", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;Lkotlin/jvm/functions/Function0;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "mapLoadedListener", "subscribeMapLoaded", "(Lcom/mapbox/maps/MapLoadedCallback;Lkotlin/jvm/functions/Function0;Lh7/d;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "mapIdleCallback", "mapIdleListener", "subscribeMapIdle", "(Lcom/mapbox/maps/MapIdleCallback;Lkotlin/jvm/functions/Function0;Lh7/b;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "mapLoadingErrorListener", "subscribeMapLoadingError", "(Lcom/mapbox/maps/MapLoadingErrorCallback;Lkotlin/jvm/functions/Function0;Lh7/c;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "styleLoadedListener", "subscribeStyleLoaded", "(Lcom/mapbox/maps/StyleLoadedCallback;Lkotlin/jvm/functions/Function0;Lh7/m;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "styleDataLoadedListener", "subscribeStyleDataLoaded", "(Lcom/mapbox/maps/StyleDataLoadedCallback;Lkotlin/jvm/functions/Function0;Lh7/j;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "sourceDataLoadedListener", "subscribeSourceDataLoaded", "(Lcom/mapbox/maps/SourceDataLoadedCallback;Lkotlin/jvm/functions/Function0;Lh7/h;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "sourceAddedListener", "subscribeSourceAdded", "(Lcom/mapbox/maps/SourceAddedCallback;Lkotlin/jvm/functions/Function0;Lh7/g;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "sourceRemovedListener", "subscribeSourceRemoved", "(Lcom/mapbox/maps/SourceRemovedCallback;Lkotlin/jvm/functions/Function0;Lh7/i;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "styleImageMissingListener", "subscribeStyleImageMissing", "(Lcom/mapbox/maps/StyleImageMissingCallback;Lkotlin/jvm/functions/Function0;Lh7/k;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "styleImageUnusedListener", "subscribeStyleImageRemoveUnused", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;Lkotlin/jvm/functions/Function0;Lh7/l;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "renderFrameStarted", "subscribeRenderFrameStarted", "(Lcom/mapbox/maps/RenderFrameStartedCallback;Lkotlin/jvm/functions/Function0;Lh7/f;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "renderFrameFinishedListener", "subscribeRenderFrameFinished", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;Lkotlin/jvm/functions/Function0;Lh7/e;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "subscribeResourceRequest", "(Lcom/mapbox/maps/ResourceRequestCallback;Lkotlin/jvm/functions/Function0;)Lcom/mapbox/common/Cancelable;", "", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "genericEventCallback", "subscribeGenericEvent", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;Lkotlin/jvm/functions/Function0;)Lcom/mapbox/common/Cancelable;", "resubscribeStyleLoadListeners", "()V", "onDestroy", "Lcom/mapbox/maps/MapLoadingError;", "error", "sendMapLoadingError", "(Lcom/mapbox/maps/MapLoadingError;)V", "listener", "", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "cancelableSet", "unsubscribeListener", "(Ljava/lang/Object;Ljava/util/Set;)V", "Lcom/mapbox/maps/NativeMapImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mapLoadingErrorCallbackSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "_cancelableSet", "Ljava/util/Set;", "get_cancelableSet$maps_sdk_release", "()Ljava/util/Set;", "get_cancelableSet$maps_sdk_release$annotations", "Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "resubscribableSet", "_resubscribableSet", "get_resubscribableSet$maps_sdk_release", "get_resubscribableSet$maps_sdk_release$annotations", "ExtendedCancelable", "ResubscribeExtendedCancelable", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NativeObserver {
    private final Set<? extends Cancelable> _cancelableSet;
    private final Set<? extends Cancelable> _resubscribableSet;
    private final CopyOnWriteArraySet<ExtendedCancelable> cancelableSet;
    private final CopyOnWriteArraySet<MapLoadingErrorCallback> mapLoadingErrorCallbackSet;
    private final NativeMapImpl observable;
    private final CopyOnWriteArraySet<ResubscribeExtendedCancelable> resubscribableSet;

    public NativeObserver(NativeMapImpl observable) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        this.observable = observable;
        this.mapLoadingErrorCallbackSet = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<ExtendedCancelable> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.cancelableSet = copyOnWriteArraySet;
        this._cancelableSet = copyOnWriteArraySet;
        CopyOnWriteArraySet<ResubscribeExtendedCancelable> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.resubscribableSet = copyOnWriteArraySet2;
        this._resubscribableSet = copyOnWriteArraySet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnCameraChangeListener$lambda$2(InterfaceC1010a onCameraChangeListener, CameraChanged it) {
        Intrinsics.checkNotNullParameter(onCameraChangeListener, "$onCameraChangeListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onCameraChangeListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapIdleListener$lambda$4(h7.b onMapIdleListener, MapIdle it) {
        Intrinsics.checkNotNullParameter(onMapIdleListener, "$onMapIdleListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onMapIdleListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadErrorListener$lambda$5(h7.c cVar, MapLoadingError it) {
        L6.e eVar;
        Intrinsics.checkNotNullParameter(cVar, StubApp.getString2(14129));
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimestamp().getTime();
        Long valueOf = Long.valueOf(it.getTimestamp().getTime());
        L6.a valueOf2 = L6.a.valueOf(it.getType().name());
        String message = it.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "this.message");
        String sourceId = it.getSourceId();
        CanonicalTileID tileId = it.getTileId();
        if (tileId != null) {
            Intrinsics.checkNotNullParameter(tileId, "<this>");
            eVar = new L6.e(tileId.getZ(), tileId.getX(), tileId.getY());
        } else {
            eVar = null;
        }
        new K6.b(time, valueOf, valueOf2, message, sourceId, eVar);
        cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnMapLoadedListener$lambda$3(h7.d onMapLoadedListener, MapLoaded it) {
        Intrinsics.checkNotNullParameter(onMapLoadedListener, "$onMapLoadedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        onMapLoadedListener.a(new K6.a(it.getTimeInterval().getBegin().getTime(), Long.valueOf(it.getTimeInterval().getEnd().getTime())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameFinishedListener$lambda$14(h7.e onRenderFrameFinishedListener, RenderFrameFinished it) {
        Intrinsics.checkNotNullParameter(onRenderFrameFinishedListener, "$onRenderFrameFinishedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        new K6.c(it.getTimeInterval().getBegin().getTime(), Long.valueOf(it.getTimeInterval().getEnd().getTime()), L6.b.valueOf(it.getRenderMode().name()), it.getNeedsRepaint(), it.getPlacementChanged());
        onRenderFrameFinishedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnRenderFrameStartedListener$lambda$13(h7.f onRenderFrameStartedListener, RenderFrameStarted it) {
        Intrinsics.checkNotNullParameter(onRenderFrameStartedListener, "$onRenderFrameStartedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        it.getTimestamp().getTime();
        it.getTimestamp().getTime();
        onRenderFrameStartedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceAddedListener$lambda$9(h7.g onSourceAddedListener, SourceAdded it) {
        Intrinsics.checkNotNullParameter(onSourceAddedListener, "$onSourceAddedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimestamp().getTime();
        Long valueOf = Long.valueOf(it.getTimestamp().getTime());
        String sourceId = it.getSourceId();
        Intrinsics.checkNotNullExpressionValue(sourceId, "this.sourceId");
        new K6.d(time, valueOf, sourceId);
        onSourceAddedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceDataLoadedListener$lambda$8(h7.h hVar, SourceDataLoaded it) {
        L6.e eVar;
        Intrinsics.checkNotNullParameter(hVar, StubApp.getString2(14130));
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimeInterval().getBegin().getTime();
        Long valueOf = Long.valueOf(it.getTimeInterval().getEnd().getTime());
        String sourceId = it.getSourceId();
        Intrinsics.checkNotNullExpressionValue(sourceId, "this.sourceId");
        L6.c valueOf2 = L6.c.valueOf(it.getType().name());
        Boolean loaded = it.getLoaded();
        CanonicalTileID tileId = it.getTileId();
        if (tileId != null) {
            Intrinsics.checkNotNullParameter(tileId, "<this>");
            eVar = new L6.e(tileId.getZ(), tileId.getX(), tileId.getY());
        } else {
            eVar = null;
        }
        new K6.e(time, valueOf, sourceId, valueOf2, loaded, eVar);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnSourceRemovedListener$lambda$10(h7.i onSourceRemovedListener, SourceRemoved it) {
        Intrinsics.checkNotNullParameter(onSourceRemovedListener, "$onSourceRemovedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimestamp().getTime();
        Long valueOf = Long.valueOf(it.getTimestamp().getTime());
        String sourceId = it.getSourceId();
        Intrinsics.checkNotNullExpressionValue(sourceId, "this.sourceId");
        new K6.f(time, valueOf, sourceId);
        onSourceRemovedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleDataLoadedListener$lambda$7(h7.j onStyleDataLoadedListener, StyleDataLoaded it) {
        Intrinsics.checkNotNullParameter(onStyleDataLoadedListener, "$onStyleDataLoadedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        new K6.g(it.getTimeInterval().getBegin().getTime(), Long.valueOf(it.getTimeInterval().getEnd().getTime()), L6.d.valueOf(it.getType().name()));
        onStyleDataLoadedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageMissingListener$lambda$11(h7.k onStyleImageMissingListener, StyleImageMissing it) {
        Intrinsics.checkNotNullParameter(onStyleImageMissingListener, "$onStyleImageMissingListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimestamp().getTime();
        Long valueOf = Long.valueOf(it.getTimestamp().getTime());
        String imageId = it.getImageId();
        Intrinsics.checkNotNullExpressionValue(imageId, "this.imageId");
        new K6.h(time, valueOf, imageId);
        onStyleImageMissingListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleImageUnusedListener$lambda$12(h7.l onStyleImageUnusedListener, StyleImageRemoveUnused it) {
        Intrinsics.checkNotNullParameter(onStyleImageUnusedListener, "$onStyleImageUnusedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        long time = it.getTimestamp().getTime();
        Long valueOf = Long.valueOf(it.getTimestamp().getTime());
        String imageId = it.getImageId();
        Intrinsics.checkNotNullExpressionValue(imageId, "this.imageId");
        new K6.i(time, valueOf, imageId);
        onStyleImageUnusedListener.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOnStyleLoadedListener$lambda$6(m onStyleLoadedListener, StyleLoaded it) {
        Intrinsics.checkNotNullParameter(onStyleLoadedListener, "$onStyleLoadedListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(it, "<this>");
        it.getTimeInterval().getBegin().getTime();
        it.getTimeInterval().getEnd().getTime();
        onStyleLoadedListener.a();
    }

    public static /* synthetic */ void get_cancelableSet$maps_sdk_release$annotations() {
    }

    public static /* synthetic */ void get_resubscribableSet$maps_sdk_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeCameraChanged$default(NativeObserver nativeObserver, CameraChangedCallback cameraChangedCallback, Function0 function0, InterfaceC1010a interfaceC1010a, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            interfaceC1010a = null;
        }
        return nativeObserver.subscribeCameraChanged(cameraChangedCallback, function0, interfaceC1010a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeCameraChangedCoalesced$default(NativeObserver nativeObserver, CameraChangedCoalescedCallback cameraChangedCoalescedCallback, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return nativeObserver.subscribeCameraChangedCoalesced(cameraChangedCoalescedCallback, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeGenericEvent$default(NativeObserver nativeObserver, String str, GenericEventCallback genericEventCallback, Function0 function0, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            function0 = null;
        }
        return nativeObserver.subscribeGenericEvent(str, genericEventCallback, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapIdle$default(NativeObserver nativeObserver, MapIdleCallback mapIdleCallback, Function0 function0, h7.b bVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            bVar = null;
        }
        return nativeObserver.subscribeMapIdle(mapIdleCallback, function0, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapLoaded$default(NativeObserver nativeObserver, MapLoadedCallback mapLoadedCallback, Function0 function0, h7.d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            dVar = null;
        }
        return nativeObserver.subscribeMapLoaded(mapLoadedCallback, function0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeMapLoadingError$default(NativeObserver nativeObserver, MapLoadingErrorCallback mapLoadingErrorCallback, Function0 function0, h7.c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            cVar = null;
        }
        return nativeObserver.subscribeMapLoadingError(mapLoadingErrorCallback, function0, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeRenderFrameFinished$default(NativeObserver nativeObserver, RenderFrameFinishedCallback renderFrameFinishedCallback, Function0 function0, h7.e eVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            eVar = null;
        }
        return nativeObserver.subscribeRenderFrameFinished(renderFrameFinishedCallback, function0, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeRenderFrameStarted$default(NativeObserver nativeObserver, RenderFrameStartedCallback renderFrameStartedCallback, Function0 function0, h7.f fVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            fVar = null;
        }
        return nativeObserver.subscribeRenderFrameStarted(renderFrameStartedCallback, function0, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeResourceRequest$default(NativeObserver nativeObserver, ResourceRequestCallback resourceRequestCallback, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return nativeObserver.subscribeResourceRequest(resourceRequestCallback, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceAdded$default(NativeObserver nativeObserver, SourceAddedCallback sourceAddedCallback, Function0 function0, h7.g gVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            gVar = null;
        }
        return nativeObserver.subscribeSourceAdded(sourceAddedCallback, function0, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceDataLoaded$default(NativeObserver nativeObserver, SourceDataLoadedCallback sourceDataLoadedCallback, Function0 function0, h7.h hVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            hVar = null;
        }
        return nativeObserver.subscribeSourceDataLoaded(sourceDataLoadedCallback, function0, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeSourceRemoved$default(NativeObserver nativeObserver, SourceRemovedCallback sourceRemovedCallback, Function0 function0, h7.i iVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            iVar = null;
        }
        return nativeObserver.subscribeSourceRemoved(sourceRemovedCallback, function0, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleDataLoaded$default(NativeObserver nativeObserver, StyleDataLoadedCallback styleDataLoadedCallback, Function0 function0, h7.j jVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            jVar = null;
        }
        return nativeObserver.subscribeStyleDataLoaded(styleDataLoadedCallback, function0, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleImageMissing$default(NativeObserver nativeObserver, StyleImageMissingCallback styleImageMissingCallback, Function0 function0, h7.k kVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            kVar = null;
        }
        return nativeObserver.subscribeStyleImageMissing(styleImageMissingCallback, function0, kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleImageRemoveUnused$default(NativeObserver nativeObserver, StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, Function0 function0, h7.l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return nativeObserver.subscribeStyleImageRemoveUnused(styleImageRemoveUnusedCallback, function0, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Cancelable subscribeStyleLoaded$default(NativeObserver nativeObserver, StyleLoadedCallback styleLoadedCallback, Function0 function0, m mVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        if ((i3 & 4) != 0) {
            mVar = null;
        }
        return nativeObserver.subscribeStyleLoaded(styleLoadedCallback, function0, mVar);
    }

    private final void unsubscribeListener(Object listener, Set<? extends ExtendedCancelable> cancelableSet) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : cancelableSet) {
            if (Intrinsics.areEqual(((ExtendedCancelable) obj).getListener(), listener)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ExtendedCancelable) it.next()).cancel();
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnCameraChangeListener(InterfaceC1010a onCameraChangeListener) {
        Intrinsics.checkNotNullParameter(onCameraChangeListener, "onCameraChangeListener");
        subscribeCameraChanged$default(this, new com.mapbox.common.module.cronet.a(16), null, onCameraChangeListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnMapIdleListener(h7.b onMapIdleListener) {
        Intrinsics.checkNotNullParameter(onMapIdleListener, "onMapIdleListener");
        subscribeMapIdle$default(this, new com.mapbox.common.module.cronet.a(10), null, onMapIdleListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnMapLoadErrorListener(h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(onMapLoadErrorListener, "onMapLoadErrorListener");
        subscribeMapLoadingError$default(this, new j(), null, onMapLoadErrorListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnMapLoadedListener(h7.d onMapLoadedListener) {
        Intrinsics.checkNotNullParameter(onMapLoadedListener, "onMapLoadedListener");
        subscribeMapLoaded$default(this, new B(onMapLoadedListener, 10), null, onMapLoadedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnRenderFrameFinishedListener(h7.e onRenderFrameFinishedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        subscribeRenderFrameFinished$default(this, new com.mapbox.common.module.cronet.a(13), null, onRenderFrameFinishedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnRenderFrameStartedListener(h7.f onRenderFrameStartedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        subscribeRenderFrameStarted$default(this, new com.mapbox.common.module.cronet.a(17), null, onRenderFrameStartedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnSourceAddedListener(h7.g onSourceAddedListener) {
        Intrinsics.checkNotNullParameter(onSourceAddedListener, "onSourceAddedListener");
        subscribeSourceAdded$default(this, new com.mapbox.common.module.cronet.a(19), null, onSourceAddedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnSourceDataLoadedListener(h7.h onSourceDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        subscribeSourceDataLoaded$default(this, new com.mapbox.common.module.cronet.a(20), null, onSourceDataLoadedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnSourceRemovedListener(h7.i onSourceRemovedListener) {
        Intrinsics.checkNotNullParameter(onSourceRemovedListener, "onSourceRemovedListener");
        subscribeSourceRemoved$default(this, new com.mapbox.common.module.cronet.a(14), null, onSourceRemovedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnStyleDataLoadedListener(h7.j onStyleDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        subscribeStyleDataLoaded$default(this, new com.mapbox.common.module.cronet.a(15), null, onStyleDataLoadedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnStyleImageMissingListener(h7.k onStyleImageMissingListener) {
        Intrinsics.checkNotNullParameter(onStyleImageMissingListener, "onStyleImageMissingListener");
        subscribeStyleImageMissing$default(this, new com.mapbox.common.module.cronet.a(11), null, onStyleImageMissingListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnStyleImageUnusedListener(h7.l onStyleImageUnusedListener) {
        Intrinsics.checkNotNullParameter(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        subscribeStyleImageRemoveUnused$default(this, new com.mapbox.common.module.cronet.a(12), null, onStyleImageUnusedListener, 2, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void addOnStyleLoadedListener(m onStyleLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleLoadedListener, "onStyleLoadedListener");
        subscribeStyleLoaded$default(this, new com.mapbox.common.module.cronet.a(18), null, onStyleLoadedListener, 2, null);
    }

    public final Set<? extends Cancelable> get_cancelableSet$maps_sdk_release() {
        return this._cancelableSet;
    }

    public final Set<? extends Cancelable> get_resubscribableSet$maps_sdk_release() {
        return this._resubscribableSet;
    }

    public final void onDestroy() {
        Iterator<T> it = this.cancelableSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        Iterator<T> it2 = this.resubscribableSet.iterator();
        while (it2.hasNext()) {
            ((Cancelable) it2.next()).cancel();
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnCameraChangeListener(InterfaceC1010a onCameraChangeListener) {
        Intrinsics.checkNotNullParameter(onCameraChangeListener, "onCameraChangeListener");
        unsubscribeListener(onCameraChangeListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnMapIdleListener(h7.b onMapIdleListener) {
        Intrinsics.checkNotNullParameter(onMapIdleListener, "onMapIdleListener");
        unsubscribeListener(onMapIdleListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnMapLoadErrorListener(h7.c onMapLoadErrorListener) {
        Intrinsics.checkNotNullParameter(onMapLoadErrorListener, "onMapLoadErrorListener");
        unsubscribeListener(onMapLoadErrorListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnMapLoadedListener(h7.d onMapLoadedListener) {
        Intrinsics.checkNotNullParameter(onMapLoadedListener, "onMapLoadedListener");
        unsubscribeListener(onMapLoadedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnRenderFrameFinishedListener(h7.e onRenderFrameFinishedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameFinishedListener, "onRenderFrameFinishedListener");
        unsubscribeListener(onRenderFrameFinishedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnRenderFrameStartedListener(h7.f onRenderFrameStartedListener) {
        Intrinsics.checkNotNullParameter(onRenderFrameStartedListener, "onRenderFrameStartedListener");
        unsubscribeListener(onRenderFrameStartedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnSourceAddedListener(h7.g onSourceAddedListener) {
        Intrinsics.checkNotNullParameter(onSourceAddedListener, "onSourceAddedListener");
        unsubscribeListener(onSourceAddedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnSourceDataLoadedListener(h7.h onSourceDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onSourceDataLoadedListener, "onSourceDataLoadedListener");
        unsubscribeListener(onSourceDataLoadedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnSourceRemovedListener(h7.i onSourceRemovedListener) {
        Intrinsics.checkNotNullParameter(onSourceRemovedListener, "onSourceRemovedListener");
        unsubscribeListener(onSourceRemovedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnStyleDataLoadedListener(h7.j onStyleDataLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleDataLoadedListener, "onStyleDataLoadedListener");
        unsubscribeListener(onStyleDataLoadedListener, this.resubscribableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnStyleImageMissingListener(h7.k onStyleImageMissingListener) {
        Intrinsics.checkNotNullParameter(onStyleImageMissingListener, "onStyleImageMissingListener");
        unsubscribeListener(onStyleImageMissingListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnStyleImageUnusedListener(h7.l onStyleImageUnusedListener) {
        Intrinsics.checkNotNullParameter(onStyleImageUnusedListener, "onStyleImageUnusedListener");
        unsubscribeListener(onStyleImageUnusedListener, this.cancelableSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "This method is deprecated, and will be removed in next major release.")
    public final void removeOnStyleLoadedListener(m onStyleLoadedListener) {
        Intrinsics.checkNotNullParameter(onStyleLoadedListener, "onStyleLoadedListener");
        unsubscribeListener(onStyleLoadedListener, this.resubscribableSet);
    }

    public final void resubscribeStyleLoadListeners() {
        Iterator<T> it = this.resubscribableSet.iterator();
        while (it.hasNext()) {
            ((ResubscribeExtendedCancelable) it.next()).resubscribe();
        }
    }

    public final void sendMapLoadingError(MapLoadingError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Iterator<T> it = this.mapLoadingErrorCallbackSet.iterator();
        while (it.hasNext()) {
            ((MapLoadingErrorCallback) it.next()).run(error);
        }
    }

    public final Cancelable subscribeCameraChanged(CameraChangedCallback cameraChangedCallback, Function0<Unit> onCancel, InterfaceC1010a onCameraChangeListener) {
        Intrinsics.checkNotNullParameter(cameraChangedCallback, "cameraChangedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCallback), onCancel, null, onCameraChangeListener, 4, null);
    }

    public final Cancelable subscribeCameraChangedCoalesced(CameraChangedCoalescedCallback cameraChangedCoalescedCallback, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(cameraChangedCoalescedCallback, "cameraChangedCoalescedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(cameraChangedCoalescedCallback), onCancel, null, null, 12, null);
    }

    @MapboxExperimental
    public final Cancelable subscribeGenericEvent(String eventName, GenericEventCallback genericEventCallback, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(genericEventCallback, "genericEventCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(eventName, genericEventCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeMapIdle(MapIdleCallback mapIdleCallback, Function0<Unit> onCancel, h7.b mapIdleListener) {
        Intrinsics.checkNotNullParameter(mapIdleCallback, "mapIdleCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(mapIdleCallback), onCancel, null, mapIdleListener, 4, null);
    }

    public final Cancelable subscribeMapLoaded(MapLoadedCallback mapLoadedCallback, Function0<Unit> onCancel, h7.d mapLoadedListener) {
        Intrinsics.checkNotNullParameter(mapLoadedCallback, "mapLoadedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadedCallback), onCancel, null, mapLoadedListener, 4, null);
    }

    public final Cancelable subscribeMapLoadingError(final MapLoadingErrorCallback mapLoadingErrorCallback, final Function0<Unit> onCancel, h7.c mapLoadingErrorListener) {
        Intrinsics.checkNotNullParameter(mapLoadingErrorCallback, "mapLoadingErrorCallback");
        this.mapLoadingErrorCallbackSet.add(mapLoadingErrorCallback);
        return new ExtendedCancelable(this, this.observable.subscribe(mapLoadingErrorCallback), new Function0<Unit>() { // from class: com.mapbox.maps.NativeObserver$subscribeMapLoadingError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CopyOnWriteArraySet copyOnWriteArraySet;
                copyOnWriteArraySet = NativeObserver.this.mapLoadingErrorCallbackSet;
                copyOnWriteArraySet.remove(mapLoadingErrorCallback);
                Function0<Unit> function0 = onCancel;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }, null, mapLoadingErrorListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameFinished(RenderFrameFinishedCallback renderFrameFinishedCallback, Function0<Unit> onCancel, h7.e renderFrameFinishedListener) {
        Intrinsics.checkNotNullParameter(renderFrameFinishedCallback, "renderFrameFinishedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameFinishedCallback), onCancel, null, renderFrameFinishedListener, 4, null);
    }

    public final Cancelable subscribeRenderFrameStarted(RenderFrameStartedCallback renderFrameStartedCallback, Function0<Unit> onCancel, h7.f renderFrameStarted) {
        Intrinsics.checkNotNullParameter(renderFrameStartedCallback, "renderFrameStartedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(renderFrameStartedCallback), onCancel, null, renderFrameStarted, 4, null);
    }

    public final Cancelable subscribeResourceRequest(ResourceRequestCallback resourceRequestCallback, Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(resourceRequestCallback, "resourceRequestCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(resourceRequestCallback), onCancel, null, null, 12, null);
    }

    public final Cancelable subscribeSourceAdded(SourceAddedCallback sourceAddedCallback, Function0<Unit> onCancel, h7.g sourceAddedListener) {
        Intrinsics.checkNotNullParameter(sourceAddedCallback, "sourceAddedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceAddedCallback), onCancel, null, sourceAddedListener, 4, null);
    }

    public final Cancelable subscribeSourceDataLoaded(SourceDataLoadedCallback sourceDataLoadedCallback, Function0<Unit> onCancel, h7.h sourceDataLoadedListener) {
        Intrinsics.checkNotNullParameter(sourceDataLoadedCallback, "sourceDataLoadedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceDataLoadedCallback), onCancel, null, sourceDataLoadedListener, 4, null);
    }

    public final Cancelable subscribeSourceRemoved(SourceRemovedCallback sourceRemovedCallback, Function0<Unit> onCancel, h7.i sourceRemovedListener) {
        Intrinsics.checkNotNullParameter(sourceRemovedCallback, "sourceRemovedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(sourceRemovedCallback), onCancel, null, sourceRemovedListener, 4, null);
    }

    public final Cancelable subscribeStyleDataLoaded(final StyleDataLoadedCallback styleDataLoadedCallback, Function0<Unit> onCancel, h7.j styleDataLoadedListener) {
        Intrinsics.checkNotNullParameter(styleDataLoadedCallback, "styleDataLoadedCallback");
        Function0<Cancelable> function0 = new Function0<Cancelable>() { // from class: com.mapbox.maps.NativeObserver$subscribeStyleDataLoaded$resubscriber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Cancelable invoke() {
                NativeMapImpl nativeMapImpl;
                nativeMapImpl = NativeObserver.this.observable;
                return nativeMapImpl.subscribe(styleDataLoadedCallback);
            }
        };
        return new ResubscribeExtendedCancelable(this, function0, function0.invoke(), this.resubscribableSet, onCancel, styleDataLoadedListener);
    }

    public final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback, Function0<Unit> onCancel, h7.k styleImageMissingListener) {
        Intrinsics.checkNotNullParameter(styleImageMissingCallback, "styleImageMissingCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageMissingCallback), onCancel, null, styleImageMissingListener, 4, null);
    }

    public final Cancelable subscribeStyleImageRemoveUnused(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback, Function0<Unit> onCancel, h7.l styleImageUnusedListener) {
        Intrinsics.checkNotNullParameter(styleImageRemoveUnusedCallback, "styleImageRemoveUnusedCallback");
        return new ExtendedCancelable(this, this.observable.subscribe(styleImageRemoveUnusedCallback), onCancel, null, styleImageUnusedListener, 4, null);
    }

    public final Cancelable subscribeStyleLoaded(final StyleLoadedCallback styleLoadedCallback, Function0<Unit> onCancel, m styleLoadedListener) {
        Intrinsics.checkNotNullParameter(styleLoadedCallback, "styleLoadedCallback");
        Function0<Cancelable> function0 = new Function0<Cancelable>() { // from class: com.mapbox.maps.NativeObserver$subscribeStyleLoaded$resubscriber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Cancelable invoke() {
                NativeMapImpl nativeMapImpl;
                nativeMapImpl = NativeObserver.this.observable;
                return nativeMapImpl.subscribe(styleLoadedCallback);
            }
        };
        return new ResubscribeExtendedCancelable(this, function0, function0.invoke(), this.resubscribableSet, onCancel, styleLoadedListener);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BK\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\nR\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/NativeObserver$ResubscribeExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/maps/NativeObserver;", "resubscriber", "Lkotlin/Function0;", "Lcom/mapbox/common/Cancelable;", "originalCancelable", "cancelableSet", "", "onCancel", "", "listener", "", "(Lcom/mapbox/maps/NativeObserver;Lkotlin/jvm/functions/Function0;Lcom/mapbox/common/Cancelable;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "setOriginalCancelable", "(Lcom/mapbox/common/Cancelable;)V", "equals", "", "other", "hashCode", "", "resubscribe", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ResubscribeExtendedCancelable extends ExtendedCancelable {
        private Cancelable originalCancelable;
        private final Function0<Cancelable> resubscriber;
        final /* synthetic */ NativeObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ResubscribeExtendedCancelable(NativeObserver nativeObserver, Function0<? extends Cancelable> resubscriber, Cancelable originalCancelable, Set<ResubscribeExtendedCancelable> cancelableSet, Function0<Unit> function0, Object obj) {
            super(nativeObserver, originalCancelable, function0, TypeIntrinsics.asMutableSet(cancelableSet), obj);
            Intrinsics.checkNotNullParameter(resubscriber, "resubscriber");
            Intrinsics.checkNotNullParameter(originalCancelable, "originalCancelable");
            Intrinsics.checkNotNullParameter(cancelableSet, "cancelableSet");
            this.this$0 = nativeObserver;
            this.resubscriber = resubscriber;
            this.originalCancelable = originalCancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(ResubscribeExtendedCancelable.class, other != null ? other.getClass() : null) || !super.equals(other)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.NativeObserver.ResubscribeExtendedCancelable");
            return Intrinsics.areEqual(this.resubscriber, ((ResubscribeExtendedCancelable) other).resubscriber);
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        @Override // com.mapbox.maps.NativeObserver.ExtendedCancelable
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.resubscriber);
        }

        public final void resubscribe() {
            getOriginalCancelable().cancel();
            setOriginalCancelable(this.resubscriber.invoke());
        }

        public void setOriginalCancelable(Cancelable cancelable) {
            Intrinsics.checkNotNullParameter(cancelable, "<set-?>");
            this.originalCancelable = cancelable;
        }

        public /* synthetic */ ResubscribeExtendedCancelable(NativeObserver nativeObserver, Function0 function0, Cancelable cancelable, Set set, Function0 function02, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, function0, cancelable, set, (i3 & 8) != 0 ? null : function02, (i3 & 16) != 0 ? null : obj);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0092\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0018\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/mapbox/maps/NativeObserver$ExtendedCancelable;", "Lcom/mapbox/common/Cancelable;", "originalCancelable", "onCancel", "Lkotlin/Function0;", "", "cancelableSet", "", "Lcom/mapbox/maps/NativeObserver;", "listener", "", "(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/common/Cancelable;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Object;)V", "getListener", "()Ljava/lang/Object;", "getOnCancel", "()Lkotlin/jvm/functions/Function0;", "getOriginalCancelable", "()Lcom/mapbox/common/Cancelable;", "cancel", "equals", "", "other", "hashCode", "", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public class ExtendedCancelable implements Cancelable {
        private final Set<ExtendedCancelable> cancelableSet;
        private final Object listener;
        private final Function0<Unit> onCancel;
        private final Cancelable originalCancelable;
        final /* synthetic */ NativeObserver this$0;

        public ExtendedCancelable(NativeObserver nativeObserver, Cancelable originalCancelable, Function0<Unit> function0, Set<ExtendedCancelable> cancelableSet, Object obj) {
            Intrinsics.checkNotNullParameter(originalCancelable, "originalCancelable");
            Intrinsics.checkNotNullParameter(cancelableSet, "cancelableSet");
            this.this$0 = nativeObserver;
            this.originalCancelable = originalCancelable;
            this.onCancel = function0;
            this.cancelableSet = cancelableSet;
            this.listener = obj;
            cancelableSet.add(this);
        }

        @Override // com.mapbox.common.Cancelable
        public void cancel() {
            this.cancelableSet.remove(this);
            getOriginalCancelable().cancel();
            Function0<Unit> function0 = this.onCancel;
            if (function0 != null) {
                function0.invoke();
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.maps.NativeObserver.ExtendedCancelable");
            ExtendedCancelable extendedCancelable = (ExtendedCancelable) other;
            return Intrinsics.areEqual(getOriginalCancelable(), extendedCancelable.getOriginalCancelable()) && Intrinsics.areEqual(this.cancelableSet, extendedCancelable.cancelableSet) && Intrinsics.areEqual(this.onCancel, extendedCancelable.onCancel) && Intrinsics.areEqual(this.listener, extendedCancelable.listener);
        }

        public final Object getListener() {
            return this.listener;
        }

        public final Function0<Unit> getOnCancel() {
            return this.onCancel;
        }

        public Cancelable getOriginalCancelable() {
            return this.originalCancelable;
        }

        public int hashCode() {
            return Objects.hash(getOriginalCancelable(), this.cancelableSet, this.onCancel, this.listener);
        }

        public /* synthetic */ ExtendedCancelable(NativeObserver nativeObserver, Cancelable cancelable, Function0 function0, Set set, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeObserver, cancelable, (i3 & 2) != 0 ? null : function0, (i3 & 4) != 0 ? nativeObserver.cancelableSet : set, (i3 & 8) != 0 ? null : obj);
        }
    }
}

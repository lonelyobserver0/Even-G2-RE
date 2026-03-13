package com.mapbox.maps.coroutine;

import Sb.v;
import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.GenericEventCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.ResourceRequest;
import com.mapbox.maps.ResourceRequestCallback;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements CameraChangedCoalescedCallback, CameraChangedCallback, GenericEventCallback, MapIdleCallback, MapLoadedCallback, RenderFrameFinishedCallback, RenderFrameStartedCallback, ResourceRequestCallback, SourceAddedCallback, SourceDataLoadedCallback, SourceRemovedCallback, StyleDataLoadedCallback, StyleImageMissingCallback, StyleImageRemoveUnusedCallback, StyleLoadedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12433a;

    public /* synthetic */ a(v vVar) {
        this.f12433a = vVar;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        Oc.a.T(this.f12433a, cameraChanged);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        Oc.a.T(this.f12433a, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.GenericEventCallback
    public void run(GenericEvent genericEvent) {
        Oc.a.T(this.f12433a, genericEvent);
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        Oc.a.T(this.f12433a, mapIdle);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        Oc.a.T(this.f12433a, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        Oc.a.T(this.f12433a, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        Oc.a.T(this.f12433a, renderFrameStarted);
    }

    @Override // com.mapbox.maps.ResourceRequestCallback
    public void run(ResourceRequest resourceRequest) {
        Oc.a.T(this.f12433a, resourceRequest);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        Oc.a.T(this.f12433a, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        Oc.a.T(this.f12433a, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        Oc.a.T(this.f12433a, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        Oc.a.T(this.f12433a, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        Oc.a.T(this.f12433a, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        Oc.a.T(this.f12433a, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        Oc.a.T(this.f12433a, styleLoaded);
    }
}

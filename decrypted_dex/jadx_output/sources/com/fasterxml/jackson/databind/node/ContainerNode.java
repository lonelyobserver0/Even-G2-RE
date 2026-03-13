package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    protected final JsonNodeFactory _nodeFactory;

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }
}

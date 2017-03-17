package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class SpmcArrayQueueProducerIndexCacheField<E> extends SpmcArrayQueueMidPad<E> {
    // This is separated from the consumerIndex which will be highly contended in the hope that this value spends most
    // of it's time in a cache line that is Shared(and rarely invalidated)
    private volatile long producerIndexCache;

    public SpmcArrayQueueProducerIndexCacheField(int capacity) {
        super(capacity);
    }

    protected final long lvProducerIndexCache() {
        return producerIndexCache;
    }

    protected final void svProducerIndexCache(long v) {
        producerIndexCache = v;
    }
}

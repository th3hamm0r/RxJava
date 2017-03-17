package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

import static rx.internal.util.unsafe.UnsafeAccess.UNSAFE;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class SpmcArrayQueueProducerField<E> extends SpmcArrayQueueL1Pad<E> {
    protected final static long P_INDEX_OFFSET = UnsafeAccess.addressOf(SpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    protected final long lvProducerIndex() {
        return producerIndex;
    }

    protected final void soTail(long v) {
        UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, v);
    }

    public SpmcArrayQueueProducerField(int capacity) {
        super(capacity);
    }
}

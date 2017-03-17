package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

import static rx.internal.util.unsafe.UnsafeAccess.UNSAFE;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class MpmcArrayQueueProducerField<E> extends MpmcArrayQueueL1Pad<E> {
    private final static long P_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueProducerField.class, "producerIndex");
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int capacity) {
        super(capacity);
    }

    protected final long lvProducerIndex() {
        return producerIndex;
    }

    protected final boolean casProducerIndex(long expect, long newValue) {
        return UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, expect, newValue);
    }
}

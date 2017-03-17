package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

import static rx.internal.util.unsafe.UnsafeAccess.UNSAFE;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class MpmcArrayQueueConsumerField<E> extends MpmcArrayQueueL2Pad<E> {
    private final static long C_INDEX_OFFSET = UnsafeAccess.addressOf(MpmcArrayQueueConsumerField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int capacity) {
        super(capacity);
    }

    protected final long lvConsumerIndex() {
        return consumerIndex;
    }

    protected final boolean casConsumerIndex(long expect, long newValue) {
        return UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, expect, newValue);
    }
}

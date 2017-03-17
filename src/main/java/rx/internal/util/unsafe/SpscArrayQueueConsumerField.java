package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

/**
 * Created by stefan on 17.03.17.
 */
@SuppressAnimalSniffer
abstract class SpscArrayQueueConsumerField<E> extends SpscArrayQueueL2Pad<E> {
    protected long consumerIndex;
    protected final static long C_INDEX_OFFSET = UnsafeAccess.addressOf(SpscArrayQueueConsumerField.class, "consumerIndex");
    public SpscArrayQueueConsumerField(int capacity) {
        super(capacity);
    }
}

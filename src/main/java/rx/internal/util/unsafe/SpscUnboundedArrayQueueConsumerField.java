package rx.internal.util.unsafe;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscUnboundedArrayQueueConsumerField<E> extends SpscUnboundedArrayQueueConsumerColdField<E> {
    protected long consumerIndex;
}

package rx.internal.util.unsafe;

import java.util.AbstractQueue;

/**
 * Created by stefan on 17.03.17.
 */
abstract class SpscUnboundedArrayQueueProducerFields<E> extends AbstractQueue<E> {
    protected long producerIndex;
}

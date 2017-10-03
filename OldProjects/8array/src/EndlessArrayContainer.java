/**
 * Created by amour on 01.03.2017.
 */
    public class EndlessArrayContainer<T> {
        private Object[] objects;

        public EndlessArrayContainer() {
            objects = new Object[0];
        }

        public void add(T element) {
            Object[] newObjects = new Object[objects.length + 1];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            newObjects[newObjects.length - 1] = element;
            objects = newObjects;
        }

        public T get(int index) {

            return (T)objects[index];
        }
    }


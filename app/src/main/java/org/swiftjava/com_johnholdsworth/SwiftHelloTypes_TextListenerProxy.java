
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener ///

package org.swiftjava.com_johnholdsworth;

@SuppressWarnings("JniMissingFunction")
public class SwiftHelloTypes_TextListenerProxy implements com.johnholdsworth.swiftbindings.SwiftHelloTypes.TextListener {

    // address of proxy object
    long __swiftObject;

    SwiftHelloTypes_TextListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract java.lang.String com.johnholdsworth.swiftbindings.SwiftHelloTypes$TextListener.getText()

    public native java.lang.String __getText( long __swiftObject );

    public java.lang.String getText() {
        return __getText( __swiftObject  );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}

package baz

import kotlinx.cinterop.*
import foobar.*

/** Test for C opaque struct [foo] */
fun baz(ptr: CPointer<foo>?) {
}

/** Test for C open struct [bar] */
fun baz(ptr: CPointer<bar>?) {
}

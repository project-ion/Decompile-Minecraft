/*  1:   */ import com.google.common.collect.Iterators;
/*  2:   */ import com.google.common.collect.Multimap;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.Iterator;
/*  5:   */ 
/*  6:   */ class ud
/*  7:   */   implements Iterable
/*  8:   */ {
/*  9:   */   ud(uc paramuc, Class paramClass) {}
/* 10:   */   
/* 11:   */   public Iterator iterator()
/* 12:   */   {
/* 13:74 */     Iterator localIterator = uc.a(this.b).get(this.b.a(this.a, true)).iterator();
/* 14:75 */     return Iterators.filter(localIterator, this.a);
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ud
 * JD-Core Version:    0.7.0.1
 */
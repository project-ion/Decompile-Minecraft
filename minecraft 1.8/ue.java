/*  1:   */ import com.google.common.collect.AbstractIterator;
/*  2:   */ import java.util.Iterator;
/*  3:   */ 
/*  4:   */ class ue
/*  5:   */   extends AbstractIterator
/*  6:   */ {
/*  7:   */   ue(uc paramuc, Iterator paramIterator) {}
/*  8:   */   
/*  9:   */   protected Object computeNext()
/* 10:   */   {
/* 11:87 */     if (!this.a.hasNext()) {
/* 12:88 */       return endOfData();
/* 13:   */     }
/* 14:90 */     return this.a.next();
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ue
 * JD-Core Version:    0.7.0.1
 */
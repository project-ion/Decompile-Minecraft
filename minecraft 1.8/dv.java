/*   1:    */ import com.google.common.collect.AbstractIterator;
/*   2:    */ 
/*   3:    */ class dv
/*   4:    */   extends AbstractIterator
/*   5:    */ {
/*   6:174 */   private dt b = null;
/*   7:    */   
/*   8:    */   dv(du paramdu) {}
/*   9:    */   
/*  10:    */   protected dt a()
/*  11:    */   {
/*  12:178 */     if (this.b == null)
/*  13:    */     {
/*  14:180 */       this.b = this.a.a;
/*  15:181 */       return this.b;
/*  16:    */     }
/*  17:182 */     if (this.b.equals(this.a.b)) {
/*  18:184 */       return (dt)endOfData();
/*  19:    */     }
/*  20:187 */     int i = this.b.n();
/*  21:188 */     int j = this.b.o();
/*  22:189 */     int k = this.b.p();
/*  23:190 */     if (i < this.a.b.n())
/*  24:    */     {
/*  25:191 */       i++;
/*  26:    */     }
/*  27:192 */     else if (j < this.a.b.o())
/*  28:    */     {
/*  29:193 */       i = this.a.a.n();
/*  30:194 */       j++;
/*  31:    */     }
/*  32:195 */     else if (k < this.a.b.p())
/*  33:    */     {
/*  34:196 */       i = this.a.a.n();
/*  35:197 */       j = this.a.a.o();
/*  36:198 */       k++;
/*  37:    */     }
/*  38:200 */     this.b = new dt(i, j, k);
/*  39:201 */     return this.b;
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     dv
 * JD-Core Version:    0.7.0.1
 */
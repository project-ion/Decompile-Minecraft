/*   1:    */ import java.util.Comparator;
/*   2:    */ 
/*   3:    */ class bxx
/*   4:    */   implements Comparator
/*   5:    */ {
/*   6:    */   bxx(bxw parambxw, bxv parambxv) {}
/*   7:    */   
/*   8:    */   public int a(to paramto1, to paramto2)
/*   9:    */   {
/*  10:566 */     int i = alq.b(paramto1.a());
/*  11:567 */     int j = alq.b(paramto2.a());
/*  12:    */     
/*  13:569 */     tq localtq1 = null;
/*  14:570 */     tq localtq2 = null;
/*  15:571 */     if (this.b.y == 2)
/*  16:    */     {
/*  17:572 */       localtq1 = ty.H[i];
/*  18:573 */       localtq2 = ty.H[j];
/*  19:    */     }
/*  20:574 */     else if (this.b.y == 0)
/*  21:    */     {
/*  22:575 */       localtq1 = ty.I[i];
/*  23:576 */       localtq2 = ty.I[j];
/*  24:    */     }
/*  25:577 */     else if (this.b.y == 1)
/*  26:    */     {
/*  27:578 */       localtq1 = ty.J[i];
/*  28:579 */       localtq2 = ty.J[j];
/*  29:    */     }
/*  30:582 */     if ((localtq1 != null) || (localtq2 != null))
/*  31:    */     {
/*  32:583 */       if (localtq1 == null) {
/*  33:584 */         return 1;
/*  34:    */       }
/*  35:585 */       if (localtq2 == null) {
/*  36:586 */         return -1;
/*  37:    */       }
/*  38:588 */       int k = bxv.b(this.b.u).a(localtq1);
/*  39:589 */       int m = bxv.b(this.b.u).a(localtq2);
/*  40:590 */       if (k != m) {
/*  41:591 */         return (k - m) * this.b.z;
/*  42:    */       }
/*  43:    */     }
/*  44:596 */     return i - j;
/*  45:    */   }
/*  46:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bxx
 * JD-Core Version:    0.7.0.1
 */
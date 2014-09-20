/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class blo
/*   4:    */   extends bln
/*   5:    */ {
/*   6:    */   private boolean e;
/*   7:    */   
/*   8:    */   public blo() {}
/*   9:    */   
/*  10:    */   public blo(Random paramRandom, int paramInt1, int paramInt2)
/*  11:    */   {
/*  12:620 */     super(paramRandom, paramInt1, 64, paramInt2, 7, 5, 9);
/*  13:    */   }
/*  14:    */   
/*  15:    */   protected void a(fn paramfn)
/*  16:    */   {
/*  17:625 */     super.a(paramfn);
/*  18:626 */     paramfn.a("Witch", this.e);
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected void b(fn paramfn)
/*  22:    */   {
/*  23:631 */     super.b(paramfn);
/*  24:632 */     this.e = paramfn.n("Witch");
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*  28:    */   {
/*  29:637 */     if (!a(paramaqu, parambjb, 0)) {
/*  30:638 */       return false;
/*  31:    */     }
/*  32:642 */     a(paramaqu, parambjb, 1, 1, 1, 5, 1, 7, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  33:643 */     a(paramaqu, parambjb, 1, 4, 2, 5, 4, 7, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  34:644 */     a(paramaqu, parambjb, 2, 1, 0, 4, 1, 0, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  35:    */     
/*  36:    */ 
/*  37:647 */     a(paramaqu, parambjb, 2, 2, 2, 3, 3, 2, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  38:648 */     a(paramaqu, parambjb, 1, 2, 3, 1, 3, 6, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  39:649 */     a(paramaqu, parambjb, 5, 2, 3, 5, 3, 6, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  40:650 */     a(paramaqu, parambjb, 2, 2, 7, 4, 3, 7, aty.f.a(ayx.b.a()), aty.f.a(ayx.b.a()), false);
/*  41:    */     
/*  42:    */ 
/*  43:653 */     a(paramaqu, parambjb, 1, 0, 2, 1, 3, 2, aty.r.P(), aty.r.P(), false);
/*  44:654 */     a(paramaqu, parambjb, 5, 0, 2, 5, 3, 2, aty.r.P(), aty.r.P(), false);
/*  45:655 */     a(paramaqu, parambjb, 1, 0, 7, 1, 3, 7, aty.r.P(), aty.r.P(), false);
/*  46:656 */     a(paramaqu, parambjb, 5, 0, 7, 5, 3, 7, aty.r.P(), aty.r.P(), false);
/*  47:    */     
/*  48:    */ 
/*  49:659 */     a(paramaqu, aty.aO.P(), 2, 3, 2, parambjb);
/*  50:660 */     a(paramaqu, aty.aO.P(), 3, 3, 7, parambjb);
/*  51:661 */     a(paramaqu, aty.a.P(), 1, 3, 4, parambjb);
/*  52:662 */     a(paramaqu, aty.a.P(), 5, 3, 4, parambjb);
/*  53:663 */     a(paramaqu, aty.a.P(), 5, 3, 5, parambjb);
/*  54:664 */     a(paramaqu, aty.ca.P().a(awd.b, awf.r), 1, 3, 5, parambjb);
/*  55:    */     
/*  56:    */ 
/*  57:667 */     a(paramaqu, aty.ai.P(), 3, 2, 6, parambjb);
/*  58:668 */     a(paramaqu, aty.bE.P(), 4, 2, 6, parambjb);
/*  59:    */     
/*  60:    */ 
/*  61:671 */     a(paramaqu, aty.aO.P(), 1, 2, 1, parambjb);
/*  62:672 */     a(paramaqu, aty.aO.P(), 5, 2, 1, parambjb);
/*  63:    */     
/*  64:    */ 
/*  65:675 */     int i = a(aty.ad, 3);
/*  66:676 */     int j = a(aty.ad, 1);
/*  67:677 */     int k = a(aty.ad, 0);
/*  68:678 */     int m = a(aty.ad, 2);
/*  69:    */     
/*  70:680 */     a(paramaqu, parambjb, 0, 4, 1, 6, 4, 1, aty.bU.a(i), aty.bU.a(i), false);
/*  71:681 */     a(paramaqu, parambjb, 0, 4, 2, 0, 4, 7, aty.bU.a(k), aty.bU.a(k), false);
/*  72:682 */     a(paramaqu, parambjb, 6, 4, 2, 6, 4, 7, aty.bU.a(j), aty.bU.a(j), false);
/*  73:683 */     a(paramaqu, parambjb, 0, 4, 8, 6, 4, 8, aty.bU.a(m), aty.bU.a(m), false);
/*  74:    */     int i1;
/*  75:686 */     for (int n = 2; n <= 7; n += 5) {
/*  76:687 */       for (i1 = 1; i1 <= 5; i1 += 4) {
/*  77:688 */         b(paramaqu, aty.r.P(), i1, -1, n, parambjb);
/*  78:    */       }
/*  79:    */     }
/*  80:692 */     if (!this.e)
/*  81:    */     {
/*  82:693 */       n = a(2, 5);
/*  83:694 */       i1 = d(2);
/*  84:695 */       int i2 = b(2, 5);
/*  85:697 */       if (parambjb.b(new dt(n, i1, i2)))
/*  86:    */       {
/*  87:698 */         this.e = true;
/*  88:    */         
/*  89:700 */         agi localagi = new agi(paramaqu);
/*  90:701 */         localagi.b(n + 0.5D, i1, i2 + 0.5D, 0.0F, 0.0F);
/*  91:702 */         localagi.a(paramaqu.E(new dt(n, i1, i2)), null);
/*  92:703 */         paramaqu.d(localagi);
/*  93:    */       }
/*  94:    */     }
/*  95:707 */     return true;
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     blo
 * JD-Core Version:    0.7.0.1
 */
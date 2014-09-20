/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnc
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   private atr a;
/*    8:     */   private atr b;
/*    9:     */   
/*   10:     */   public bnc() {}
/*   11:     */   
/*   12:     */   public bnc(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, ej paramej)
/*   13:     */   {
/*   14:1634 */     super(parambnk, paramInt);
/*   15:     */     
/*   16:1636 */     this.m = paramej;
/*   17:1637 */     this.l = parambjb;
/*   18:     */     
/*   19:1639 */     this.a = a(paramRandom);
/*   20:1640 */     this.b = a(paramRandom);
/*   21:     */   }
/*   22:     */   
/*   23:     */   protected void a(fn paramfn)
/*   24:     */   {
/*   25:1645 */     super.a(paramfn);
/*   26:1646 */     paramfn.a("CA", atr.c.b(this.a));
/*   27:1647 */     paramfn.a("CB", atr.c.b(this.b));
/*   28:     */   }
/*   29:     */   
/*   30:     */   protected void b(fn paramfn)
/*   31:     */   {
/*   32:1652 */     super.b(paramfn);
/*   33:1653 */     this.a = atr.c(paramfn.f("CA"));
/*   34:1654 */     this.b = atr.c(paramfn.f("CB"));
/*   35:     */   }
/*   36:     */   
/*   37:     */   private atr a(Random paramRandom)
/*   38:     */   {
/*   39:1658 */     switch (paramRandom.nextInt(5))
/*   40:     */     {
/*   41:     */     default: 
/*   42:1660 */       return aty.aj;
/*   43:     */     case 0: 
/*   44:1662 */       return aty.cb;
/*   45:     */     }
/*   46:1664 */     return aty.cc;
/*   47:     */   }
/*   48:     */   
/*   49:     */   public static bnc a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, ej paramej, int paramInt4)
/*   50:     */   {
/*   51:1669 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 7, 4, 9, paramej);
/*   52:1671 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   53:1672 */       return null;
/*   54:     */     }
/*   55:1675 */     return new bnc(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   56:     */   }
/*   57:     */   
/*   58:     */   public boolean a(aqu paramaqu, Random paramRandom, bjb parambjb)
/*   59:     */   {
/*   60:1680 */     if (this.h < 0)
/*   61:     */     {
/*   62:1681 */       this.h = b(paramaqu, parambjb);
/*   63:1682 */       if (this.h < 0) {
/*   64:1683 */         return true;
/*   65:     */       }
/*   66:1685 */       this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*   67:     */     }
/*   68:1689 */     a(paramaqu, parambjb, 0, 1, 0, 6, 4, 8, aty.a.P(), aty.a.P(), false);
/*   69:     */     
/*   70:     */ 
/*   71:1692 */     a(paramaqu, parambjb, 1, 0, 1, 2, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   72:1693 */     a(paramaqu, parambjb, 4, 0, 1, 5, 0, 7, aty.ak.P(), aty.ak.P(), false);
/*   73:     */     
/*   74:1695 */     a(paramaqu, parambjb, 0, 0, 0, 0, 0, 8, aty.r.P(), aty.r.P(), false);
/*   75:1696 */     a(paramaqu, parambjb, 6, 0, 0, 6, 0, 8, aty.r.P(), aty.r.P(), false);
/*   76:1697 */     a(paramaqu, parambjb, 1, 0, 0, 5, 0, 0, aty.r.P(), aty.r.P(), false);
/*   77:1698 */     a(paramaqu, parambjb, 1, 0, 8, 5, 0, 8, aty.r.P(), aty.r.P(), false);
/*   78:     */     
/*   79:1700 */     a(paramaqu, parambjb, 3, 0, 1, 3, 0, 7, aty.j.P(), aty.j.P(), false);
/*   80:1702 */     for (int i = 1; i <= 7; i++)
/*   81:     */     {
/*   82:1703 */       a(paramaqu, this.a.a(uv.a(paramRandom, 2, 7)), 1, 1, i, parambjb);
/*   83:1704 */       a(paramaqu, this.a.a(uv.a(paramRandom, 2, 7)), 2, 1, i, parambjb);
/*   84:1705 */       a(paramaqu, this.b.a(uv.a(paramRandom, 2, 7)), 4, 1, i, parambjb);
/*   85:1706 */       a(paramaqu, this.b.a(uv.a(paramRandom, 2, 7)), 5, 1, i, parambjb);
/*   86:     */     }
/*   87:1709 */     for (i = 0; i < 9; i++) {
/*   88:1710 */       for (int j = 0; j < 7; j++)
/*   89:     */       {
/*   90:1711 */         b(paramaqu, j, 4, i, parambjb);
/*   91:1712 */         b(paramaqu, aty.d.P(), j, -1, i, parambjb);
/*   92:     */       }
/*   93:     */     }
/*   94:1716 */     return true;
/*   95:     */   }
/*   96:     */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bnc
 * JD-Core Version:    0.7.0.1
 */